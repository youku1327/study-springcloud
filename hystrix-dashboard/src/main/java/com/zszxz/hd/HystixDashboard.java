package com.zszxz.hd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author lsc
 * <p> </p>
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrixDashboard//开启监控
public class HystixDashboard {

    public static void main(String[] args) {
        SpringApplication.run(HystixDashboard.class,args);
    }
}
