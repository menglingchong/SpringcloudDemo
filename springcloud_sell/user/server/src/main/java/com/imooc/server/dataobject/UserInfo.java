package com.imooc.server.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author ：menglc
 * @date ：Created in 2020/1/2 21:43
 */
@Data
@Entity
public class UserInfo {
    @Id
    private String id;
    private String username;
    private String password;
    private String openid;
    private Integer role;
}
