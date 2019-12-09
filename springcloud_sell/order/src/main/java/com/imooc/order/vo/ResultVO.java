package com.imooc.order.vo;

import lombok.Data;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/9 22:17
 */
@Data
public class ResultVO<T> {
    private Integer code;

    private String msg;

    private T data;
}
