package com.zszxz.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author lsc
 * <p> </p>
 */
@SpringBootApplication
@EnableEurekaClient//表示开启 eureka client
public class EurekaClientApp {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApp.class,args);
    }
}
