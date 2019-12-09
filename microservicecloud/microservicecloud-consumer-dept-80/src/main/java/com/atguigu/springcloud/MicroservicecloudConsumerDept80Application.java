package com.atguigu.springcloud;

import com.atguigu.myrule.MySelfRule;
import com.atguigu.myrule.RandomRule_ZY;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient  //eureka的客户端
// 在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效,但是MySelfRule类不能和主启动类在同一个包下
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration= RandomRule_ZY.class)
public class MicroservicecloudConsumerDept80Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConsumerDept80Application.class, args);
    }
}
