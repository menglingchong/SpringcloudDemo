package com.imooc.order.server.repository;

import com.imooc.order.server.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/4 14:09
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
    List<OrderDetail> findByOrderId(String orderId);
}
