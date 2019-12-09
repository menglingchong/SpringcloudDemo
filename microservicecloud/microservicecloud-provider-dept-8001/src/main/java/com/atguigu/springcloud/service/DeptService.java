package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;

import java.util.List;

/**
 * @author ：menglc
 * @date ：Created in 2019/11/20 9:37
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept findById (Long Id);

    public List<Dept> findAll();
}
