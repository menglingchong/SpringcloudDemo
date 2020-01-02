package com.imooc.server.controller;

import com.imooc.server.service.UserService;
import com.imooc.server.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author ：menglc
 * @date ：Created in 2020/1/2 22:00
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;

    public ResultVO buyer(@RequestParam("openid") String openid, HttpServletResponse response) {


        return null;
    }


}
