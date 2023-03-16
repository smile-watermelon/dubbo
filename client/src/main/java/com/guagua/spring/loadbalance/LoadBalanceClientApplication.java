package com.guagua.spring.loadbalance;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author guagua
 * @date 2023/3/16 14:20
 * @describe
 */
@SpringBootApplication
@EnableDubbo
public class LoadBalanceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoadBalanceClientApplication.class, args);
    }
}
