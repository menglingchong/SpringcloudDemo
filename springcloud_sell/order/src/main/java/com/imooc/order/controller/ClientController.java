package com.imooc.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/10 10:53
 */
@RestController
@Slf4j
public class ClientController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    
    
    @GetMapping("/getProductMsg")
    public String getProductMsg() {
        //第一种方式（直接使用restTemplate,url写死）
        // RestTemplate restTemplate = new RestTemplate();
        // String response = restTemplate.getForObject("http://localhost:8002/msg", String.class);
        
        //第二种方式（利用loadBanlanceClient通过应用名获取url,然后再使用restTemplate）
        // RestTemplate restTemplate = new RestTemplate();
        // ServiceInstance serviceInstance = loadBalancerClient.choose("SPRINGCLOUD-PRODUCT");
        // String url = String.format("http://%s:%s", serviceInstance.getHost(), serviceInstance.getPort()) + "/msg";
        // String response = restTemplate.getForObject(url, String.class);
        
        //第三种方式（利用@LoadBalanced,可在restTemplate里使用应用名字）
        String response = restTemplate.getForObject("http://SPRINGCLOUD-PRODUCT/msg", String.class);
        log.info("response={}",response);
        return response;
    }
}
