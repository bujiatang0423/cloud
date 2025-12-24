package com.geekbang.coupon.calculation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.geekbang"})
public class Calculation {

    public static void main(String[] args) {
        SpringApplication.run(Calculation.class, args);
    }
}
