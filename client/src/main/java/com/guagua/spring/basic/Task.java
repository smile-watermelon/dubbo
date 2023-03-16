package com.guagua.spring.basic;

import com.guagua.spring.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author guagua
 * @date 2023/3/14 01:30
 * @describe
 */
@Component
public class Task implements CommandLineRunner {

    @DubboReference(protocol = "dubbo")
    private DemoService demoService;

    @Override
    public void run(String... args) throws Exception {
        String response = demoService.sayHello("spring");
        System.out.println("dubbo spring response=" + response);

        new Thread(() -> {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(new Date() + " receive =====> " + demoService.sayHello("world"));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        }).start();
    }
}
