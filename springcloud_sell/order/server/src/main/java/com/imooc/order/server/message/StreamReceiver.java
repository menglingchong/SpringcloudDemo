package com.imooc.order.server.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/30 17:04
 */
@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class StreamReceiver {
    @StreamListener(value = StreamClient.OUTPUT)
    public void process(Object message) {
        log.info("StreamReceiver: {}",message);
    }
}
