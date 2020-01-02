package com.imooc.server.service;

import com.imooc.server.dataobject.UserInfo;

public interface UserService {
    /**
     * 通过openid来查询用户信息
     * @param openid
     * @return
     */
    UserInfo findByOpenid(String openid);
}
