package com.imooc.order.server;

import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/20 23:00
 * 发送mq消息测试
 */
@Component
public class MqSenderTest extends ServerApplicationTests {
    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void send() {
        amqpTemplate.convertAndSend("myQueue","now "+new Date());
    }

    @Test
    public void sendOrder() {
        amqpTemplate.convertAndSend("myOrder","computer","now "+new Date());
    }
}
