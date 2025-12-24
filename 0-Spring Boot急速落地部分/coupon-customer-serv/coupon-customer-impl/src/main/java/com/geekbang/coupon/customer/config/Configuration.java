package com.geekbang.coupon.customer.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author bujiatang
 */
@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    Logger.Level feignLogger(){
        return Logger.Level.FULL;
    }
}
