package com.imooc.product.server.dto;

import lombok.Data;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/11 10:10
 */
@Data
public class CartDTO {
    /**
     * 商品id
     */
    private String productId;
    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
