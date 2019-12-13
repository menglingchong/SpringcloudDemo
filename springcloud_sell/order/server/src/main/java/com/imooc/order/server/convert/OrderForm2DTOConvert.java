package com.imooc.order.server.convert;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.imooc.order.server.dataobject.OrderDetail;
import com.imooc.order.server.dto.OrderDTO;
import com.imooc.order.server.enums.ResultEnum;
import com.imooc.order.server.exception.OrderException;
import com.imooc.order.server.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/9 21:53
 *  Form2DTO 即请求参数对象转换成DTO
 */
@Slf4j
public class OrderForm2DTOConvert {
    public static OrderDTO convert(OrderForm orderForm) {
        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),new TypeToken<List<OrderDetail>>(){}.getType());
        } catch (JsonSyntaxException e) {
            log.error("【json转换出错】,string={}",orderForm.getItems());
            throw new OrderException(ResultEnum.CART_EMPTY);
        }
        orderDTO.setOrderDetailList(orderDetailList);
        return orderDTO;
    }
}
