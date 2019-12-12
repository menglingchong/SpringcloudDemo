package com.imooc.order.server.enums;

import lombok.Getter;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/4 14:24
 */
@Getter
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;
    private Integer Code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        Code = code;
        this.message = message;
    }
}
