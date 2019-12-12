package com.imooc.order.server.enums;

import lombok.Getter;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/4 14:20
 */
@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "取消"),
    ;
    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
