package com.zszxz.fh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author lsc
 * <p> </p>
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class FeignHystrixApp {

    public static void main(String[] args) {
        SpringApplication.run(FeignHystrixApp.class,args);
    }
}
