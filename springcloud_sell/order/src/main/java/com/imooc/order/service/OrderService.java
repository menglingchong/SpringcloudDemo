package com.imooc.order.service;

import com.imooc.order.dto.OrderDTO;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/4 18:06
 */
public interface OrderService {
    //创建订单
    OrderDTO create(OrderDTO orderDTO);
}
