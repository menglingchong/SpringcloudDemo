package com.imooc.product.server.service.impl;

import com.imooc.product.server.dataobject.ProductCategory;
import com.imooc.product.server.repository.ProductCategoryRepository;
import com.imooc.product.server.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/4 9:52
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;
    
    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
