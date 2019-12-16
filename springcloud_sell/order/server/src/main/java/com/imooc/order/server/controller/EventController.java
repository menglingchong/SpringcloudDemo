package com.imooc.order.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/15 22:05
 */
@RestController
@RequestMapping("/gitEnvironment")
@RefreshScope
public class EventController {
    @Value("${spring.profiles}")
    private String env;

    @GetMapping("/print")
    public String print() {
        return env;
    }
}
