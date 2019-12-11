package com.imooc.product.product.enums;

import lombok.Getter;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/11 10:20
 */
@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIST(1,"商品不存在"),
    PRODUCT_STOCK_ERROR(2,"库存不足"),
    ;
    
    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
