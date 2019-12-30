package com.imooc.order.server.message;

import org.apache.el.stream.Stream;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/30 16:59
 */
public interface StreamClient {
    String INPUT = "myMessage";
    String OUTPUT = "myMessage2";

    @Input(StreamClient.INPUT)
    SubscribableChannel input();
    
    @Output(StreamClient.OUTPUT)
    MessageChannel output();
}
