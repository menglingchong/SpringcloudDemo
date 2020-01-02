package com.imooc.server.service.impl;

import com.imooc.server.dataobject.UserInfo;
import com.imooc.server.repository.UserInfoRepostory;
import com.imooc.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：menglc
 * @date ：Created in 2020/1/2 21:48
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoRepostory userInfoRepostory;

    /**
     * 通过openid来查询用户信息
     * @param openid
     * @return
     */
    @Override
    public UserInfo findByOpenid(String openid) {
        return userInfoRepostory.findByOpenid(openid);
    }
}
