package com.zszxz.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @Author lsc
 * <p> </p>
 */
@SpringBootApplication
@EnableHystrix // 启用 hystrix
@EnableDiscoveryClient// 服务注册发现
public class HystrixApp {

    public static void main(String[] args) {
        SpringApplication.run(HystrixApp.class, args);
    }
}
