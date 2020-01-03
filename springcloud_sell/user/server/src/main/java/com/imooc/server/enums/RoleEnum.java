package com.imooc.server.enums;

import lombok.Getter;

/**
 * @author ：menglc
 * @date ：Created in 2020/1/3 15:07
 */
@Getter
public enum RoleEnum {
    BUYER(1,"买家"),
    SELLER(2,"卖家"),
    ;

    private Integer code;
    private String message;

    RoleEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
