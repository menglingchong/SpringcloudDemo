package com.imooc.order.server.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/19 23:47
 */
@Data
@Component
@RefreshScope
@ConfigurationProperties("girl")
public class GirlConfig {
    private String name;

    private Integer age;
}
