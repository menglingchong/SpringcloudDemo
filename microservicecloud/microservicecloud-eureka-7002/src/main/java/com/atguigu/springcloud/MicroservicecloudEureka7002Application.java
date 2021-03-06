package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //EurekaServer服务器端启动类，接受其他微服务注册进来
public class MicroservicecloudEureka7002Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudEureka7002Application.class, args);
    }

}
