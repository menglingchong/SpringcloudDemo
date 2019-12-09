package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MicroservicecloudZuulGetway9527Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudZuulGetway9527Application.class, args);
    }

}
