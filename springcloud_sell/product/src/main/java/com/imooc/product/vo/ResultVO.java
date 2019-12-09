package com.imooc.product.vo;

import lombok.Data;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/4 10:08
 */
@Data
public class ResultVO<T> {
    //错误码
    private Integer code;
    //提示信息
    private String msg;
    //具体内容
    private T data;
}
