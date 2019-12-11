package com.imooc.product.server.service;


import com.imooc.product.server.dataobject.ProductCategory;

import java.util.List;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/4 9:50
 */
public interface CategoryService {
    
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
