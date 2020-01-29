package com.zszxz.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author lsc
 * <p> zuul-client启动类</p>
 */
@SpringBootApplication
@EnableDiscoveryClient//开启eureka注册与发现
public class ZuulApp {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApp.class, args);
    }
}
