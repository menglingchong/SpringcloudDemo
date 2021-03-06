package com.imooc.apigetway.filter;

import com.imooc.apigetway.constant.RedisConstant;
import com.imooc.apigetway.utils.CookieUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_DECORATION_FILTER_ORDER;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * 鉴权（区分买家和卖家）
 *
 * @author ：menglc
 * @date ：Created in 2020/1/2 14:26
 */

@Component
public class AuthorFilter extends ZuulFilter {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return PRE_DECORATION_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();

        //  /order/create  只能买家访问(cookie中有openid)
        //  /order/finish  只能卖家访问(cookie中有token,并且对应的redis中的值)
        //  /product/list  都可以访问

        if ("/springcloud-order2/order/create".equals(request.getRequestURI())) {
            Cookie cookie = CookieUtil.get(request, "openid");
            if (cookie == null || StringUtils.isEmpty(cookie.getValue())) {
                requestContext.setSendZuulResponse(false);
                requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value()); //权限不足
            }
        }

        if ("/springcloud-order2/order/finish".equals(request.getRequestURI())) {
            Cookie cookie = CookieUtil.get(request, "token");
            String redisValue = stringRedisTemplate.opsForValue().get(String.format(RedisConstant.TOKEN_TEMPLATE, cookie.getValue()));
            if (cookie == null
                    || StringUtils.isEmpty(cookie.getValue())
                    || StringUtils.isEmpty(redisValue)) {
                requestContext.setSendZuulResponse(false);
                requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value()); //权限不足
            }
        }
        return null;
    }
}
