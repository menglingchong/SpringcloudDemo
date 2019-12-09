package com.atguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：menglc
 * @date ：Created in 2019/11/21 9:28
 */
@Configuration //配置类
public class ConfigBean {
    //使用restTemplate发送HTTP请求访问Rest服务
    @Bean
    @LoadBalanced //Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端 负载均衡的工具。默认按照轮询的方式访问服务提供者
    public RestTemplate restTemplate () {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule() {
        // return new RandomRule(); //目的是重新选择随机算法替代默认的轮询算法
        
        return new RetryRule();  //先按照RoundRobinRule的策略获取服务，如果获取服务失败则在指定时间内会进行重试，获取可用的服务
    }
}
