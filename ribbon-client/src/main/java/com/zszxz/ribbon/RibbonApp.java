package com.zszxz.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author lsc
 * <p>知识追寻者 ribbon启动类 </p>
 */
@SpringBootApplication
@EnableEurekaClient
public class RibbonApp {

    public static void main(String[] args) {
        SpringApplication.run(RibbonApp.class,args);
    }
}
