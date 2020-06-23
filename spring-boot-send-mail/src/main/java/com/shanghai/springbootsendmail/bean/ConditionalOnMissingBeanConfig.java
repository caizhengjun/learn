package com.shanghai.springbootsendmail.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author caizhengjun
 * @version 1.0
 * @date 2020/6/18 9:55 下午
 */
@Configuration
public class ConditionalOnMissingBeanConfig {

    @Bean
    public UserA userA() {
        return new UserA("A", 1);
    }

    @Bean
    @ConditionalOnMissingBean(name = "userA")
    public UserB userB() {
        return new UserB("B", 2);
    }
}
