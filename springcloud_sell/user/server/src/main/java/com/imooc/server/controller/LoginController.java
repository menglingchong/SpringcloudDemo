package com.imooc.server.controller;

import com.imooc.server.constant.CookieConstant;
import com.imooc.server.dataobject.UserInfo;
import com.imooc.server.enums.ResultEnum;
import com.imooc.server.enums.RoleEnum;
import com.imooc.server.service.UserService;
import com.imooc.server.utils.CookieUtil;
import com.imooc.server.utils.ResultVoUtil;
import com.imooc.server.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.management.relation.Role;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：menglc
 * @date ：Created in 2020/1/2 22:00
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;

    /**
     *  买家登录
     * @param openid
     * @param response
     * @return
     */
    @GetMapping("/buyer")
    public ResultVO buyer(@RequestParam("openid") String openid, HttpServletResponse response) {
        //1. openid和数据库里的数据是否匹配
        UserInfo userInfo = userService.findByOpenid(openid);
        if (userInfo == null) {
            return ResultVoUtil.error(ResultEnum.LOGIN_FAIL);
        }
        //2.判断角色
        if (!RoleEnum.BUYER.getCode().equals(userInfo.getRole())) {
            return ResultVoUtil.error(ResultEnum.ROLE_ERROR);
        }
        
        //3.cookie里设置openid=abc
        CookieUtil.set(response, CookieConstant.OPENID,openid,CookieConstant.expire);
        return ResultVoUtil.success();
    }

    /**
     * 买家登录
     * @param openid
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/seller")
    public ResultVO seller(@RequestParam("openid") String openid, HttpServletRequest request, HttpServletResponse response){
        
        
        return null;
    }


}
