package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/4 14:09
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}
