package com.imooc.order.client;

import com.imooc.order.dataobject.ProductInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/10 19:09
 * @desc : 定义订单服务要调用的接口，即服务间通信要调用的接口
 */
@FeignClient(name = "springcloud-product")
public interface ProductClient {
    @GetMapping("/msg")
    String productMsg();

    @PostMapping("/product/listForOrder")
    public List<ProductInfo> listForOrder(@RequestBody List<String> productIdList);
}
 