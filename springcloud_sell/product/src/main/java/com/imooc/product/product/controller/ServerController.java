package com.imooc.product.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/10 10:51
 */
@RestController
public class ServerController {
    @GetMapping("/msg")
    public String  msg() {
        return "this is product' msg";
    }
}
