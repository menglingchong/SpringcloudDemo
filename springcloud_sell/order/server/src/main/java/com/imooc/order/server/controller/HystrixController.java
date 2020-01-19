package com.imooc.order.server.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * @author ：menglc
 * @date ：Created in 2020/1/13 10:35
 */
@RestController
@DefaultProperties(defaultFallback = "defaultFallback")
public class HystrixController {

    //配置超时时间
    // @HystrixCommand (commandProperties = {
    //         @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "6000")
    // })

    //配置服务熔断
    // @HystrixCommand(commandProperties = {
    //         @HystrixProperty(name = "circuitBreaker.enabled",value = "true"), //设置熔断
    //         @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"), //请求数达到后才计算
    //         @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"), //休眠时间窗口
    //         @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),	//错误率
    // })

    //配置服务熔断注解@HystrixCommand
    /*@HystrixCommand(fallbackMethod = "fallback")*/
    @HystrixCommand
    @GetMapping("/getProductInfoList")
    public String getProductInfoList(@RequestParam("number") Integer number) {
        if (number % 2 == 0) {
            return "success";
        }
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject("http://localhost:8002/product/listForOrder",
                Arrays.asList("157875196366160022"),
                String.class);
        // throw new RuntimeException("发送异常了");
    }

    private String fallback() {
        return "太拥挤了，请稍后再试！";
    }

    private String defaultFallback() {
        return "默认提示：太拥挤了，请稍后再试···";
    }
}
