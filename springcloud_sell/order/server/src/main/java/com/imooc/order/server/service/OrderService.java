package com.imooc.order.server.service;


import com.imooc.order.server.dto.OrderDTO;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/4 18:06
 */
public interface OrderService {
    //创建订单
    OrderDTO create(OrderDTO orderDTO);

    //完结订单（只能卖家操作）
    OrderDTO finish(String orderId);
}
