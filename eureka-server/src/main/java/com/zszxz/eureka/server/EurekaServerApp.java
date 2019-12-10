package com.zszxz.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author lsc
 * <p> eureka 服务端  </p>
 */
@SpringBootApplication
@EnableEurekaServer//表示开启eureka server功能
public class EurekaServerApp {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApp.class,args);
    }

}
