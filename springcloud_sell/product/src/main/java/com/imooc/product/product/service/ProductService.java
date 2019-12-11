package com.imooc.product.product.service;

import com.imooc.product.product.dataobject.ProductInfo;
import com.imooc.product.product.dto.CartDTO;

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
    List<ProductInfo> findList(List<String> productIdList);

    // 扣库存
    void decreaseStock(List<CartDTO> cartDTOList);

}
