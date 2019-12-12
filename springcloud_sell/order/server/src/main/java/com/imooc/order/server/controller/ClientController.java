package com.imooc.order.server.controller;

import com.imooc.product.client.ProductClient;
import com.imooc.product.common.DecreaseStockInput;
import com.imooc.product.common.ProductInfoOutput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

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
    @Autowired
    private ProductClient productClient;


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
        // String response = restTemplate.getForObject("http://SPRINGCLOUD-PRODUCT/msg", String.class);
        
        //通过Feign来调用商品服务，feign是一个声明式的web服务客户端
        String response = productClient.productMsg();
        log.info("通过Feign声明式的web服务客户端调用商品服务，response={}",response);
        return response;
    }
    
    @GetMapping("/getProductList")
    public String getProductList() {
        List<ProductInfoOutput> productInfos = productClient.listForOrder(Arrays.asList("164103465734242707", "157875227953464068"));
        log.info("订单服务调用商品服务返回的结果：productInfos{}",productInfos);
        return "ok";
    }
    
    @GetMapping("/productDecreaseStock")
    public String productDecreaseStock() {
        productClient.decreaseStock(Arrays.asList(new DecreaseStockInput("164103465734242707",2)));
        return "ok";
    }
}
