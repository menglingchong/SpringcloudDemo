package com.imooc.product.repository;

import com.imooc.product.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/3 20:49
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}