package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard //hystrix提供了准实时的调用监控（Hystrix Dashborad）,hystrix会持续地记录所有通过hystrix发起的请求的执行信息
public class MicroservicecloudConsumerHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConsumerHystrixDashboardApplication.class, args);
    }

}
