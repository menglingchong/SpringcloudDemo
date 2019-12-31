package com.imooc.order.server.message;

import com.imooc.order.server.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/30 17:04
 */
@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class StreamReceiver {
    // @StreamListener(value = StreamClient.OUTPUT)
    // public void process(Object message) {
    //     log.info("StreamReceiver: {}",message);
    // }

    //接收orderDTO对象 消息
    @StreamListener(value = StreamClient.OUTPUT)
    @SendTo(StreamClient.INPUT2)
    public String process(OrderDTO message) {
        log.info("StreamReceiver: {}",message);
        return "Received Message And Send To Input2";
    }

    @StreamListener(value = StreamClient.INPUT2)
    public void process2(String message) {
        log.info("StreamReceiver2: {}",message);
    }
}
