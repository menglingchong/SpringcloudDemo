package com.imooc.order.server.enums;

import lombok.Getter;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/9 21:46
 */
@Getter
public enum  ResultEnum {
    PRRAM_ERROR(1,"参数错误"),
    CART_EMPTY(2, "购物车为空"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
