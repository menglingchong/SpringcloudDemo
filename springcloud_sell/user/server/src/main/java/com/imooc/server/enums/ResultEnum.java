package com.imooc.server.enums;

import lombok.Getter;

/**
 * @author ：menglc
 * @date ：Created in 2020/1/3 15:00
 */
@Getter
public enum ResultEnum {
    LOGIN_FAIL(1,"登录失败"),
    ROLE_ERROR(2,"角色权限有误"),
    ;
    
    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
