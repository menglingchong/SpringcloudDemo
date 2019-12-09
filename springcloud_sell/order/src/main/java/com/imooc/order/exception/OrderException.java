package com.imooc.order.exception;

import com.imooc.order.enums.ResultEnum;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/9 21:41
 */
public class OrderException extends RuntimeException {
    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
