package com.imooc.product.service;

import com.imooc.product.dataobject.ProductInfo;

import java.util.List;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/3 21:00
 */
public interface ProductService {
    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();
    
    //查询商品列表

    // 扣库存
    
}
