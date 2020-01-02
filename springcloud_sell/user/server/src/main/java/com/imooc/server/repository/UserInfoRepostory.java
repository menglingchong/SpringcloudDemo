package com.imooc.server.repository;

import com.imooc.server.dataobject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author ：menglc
 * @date ：Created in 2020/1/2 21:44
 */
public interface UserInfoRepostory extends JpaRepository<UserInfo, String> {
    UserInfo findByOpenid(String openid);
}
