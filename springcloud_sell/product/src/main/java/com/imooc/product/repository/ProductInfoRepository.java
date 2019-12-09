package com.imooc.product.repository;

import com.imooc.product.dataobject.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/3 20:28
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {
    
    List<ProductInfo> findByProductStatus(Integer productStatus);

    List<ProductInfo> findByProductIdIn(List<String> productIdList);
}
