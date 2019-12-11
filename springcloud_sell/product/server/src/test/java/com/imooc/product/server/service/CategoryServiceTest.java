package com.imooc.product.server.service;

import com.imooc.product.server.ServerApplicationTests;
import com.imooc.product.server.dataobject.ProductCategory;
import com.imooc.product.server.repository.ProductCategoryRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryServiceTest extends ServerApplicationTests {
    
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findByCategoryTypeIn() throws Exception{
        List<ProductCategory> productCategories = productCategoryRepository.findByCategoryTypeIn(Arrays.asList(11, 22));
        Assert.assertTrue(productCategories.size() > 0);
    }
}