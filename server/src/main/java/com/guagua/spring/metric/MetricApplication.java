package com.guagua.spring.metric;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author guagua
 * @date 2023/3/16 18:41
 * @describe
 */
@SpringBootApplication
@EnableDubbo
public class MetricApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetricApplication.class, args);
    }
}
