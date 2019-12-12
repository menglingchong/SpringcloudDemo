package com.imooc.order.server.repository;

import com.imooc.order.server.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/4 14:10
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
