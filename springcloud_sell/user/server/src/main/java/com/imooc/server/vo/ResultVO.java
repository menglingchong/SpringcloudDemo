package com.imooc.server.vo;

import lombok.Data;

/**
 * @author ：menglc
 * @date ：Created in 2020/1/2 22:05
 */
@Data
public class ResultVO<T> {
    private Integer code;

    private String msg;

    private T data;
}
