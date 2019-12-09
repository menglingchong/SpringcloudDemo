package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.atguigu.springcloud"}) //Fegin的使用
@ComponentScan(value = "com.atguigu.springcloud")
public class MicroservicecloudConsumerDeptFeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConsumerDeptFeginApplication.class, args);
    }

}
