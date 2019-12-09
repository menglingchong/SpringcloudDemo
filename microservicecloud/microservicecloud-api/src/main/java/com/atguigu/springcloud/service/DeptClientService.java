package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author ：menglc
 * @date ：Created in 2019/11/26 21:02
 */
//Fegin的实现 仅需创建一个接口并使用注解的方式来配置。springcloud对fegin进行了封装，使其支持了Spring MVC标准注解和HttpMessageConverts
// 通过Fegin直接找到服务接口，由于在服务调用的时候融合了Ribbon技术，所以支持负载均衡
// @FeignClient(value = "MICROSERVICECLOUD-DEPT")
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class) //在注解@feignClient中添加fallbackFactory属性值,服务熔断技术和Feign一起使用
public interface DeptClientService {
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list();

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(Dept dept);

}
