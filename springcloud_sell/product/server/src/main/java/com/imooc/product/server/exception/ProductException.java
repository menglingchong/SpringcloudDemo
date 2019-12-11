package com.imooc.product.server.exception;


import com.imooc.product.server.enums.ResultEnum;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/11 10:18
 */
public class ProductException extends RuntimeException {
    private Integer code;
    public ProductException(Integer code,String message) {
        super(message);
        this.code = code;
    }
    
    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
