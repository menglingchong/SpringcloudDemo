package com.imooc.product.server.enums;

import lombok.Getter;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/4 9:37
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架"),
    ;
    
    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
