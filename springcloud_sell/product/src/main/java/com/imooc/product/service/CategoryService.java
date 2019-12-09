package com.imooc.product.service;

import com.imooc.product.dataobject.ProductCategory;

import java.util.List;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/4 9:50
 */
public interface CategoryService {
    
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}