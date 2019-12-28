package com.zszxz.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author lsc
 * <p> feign启动类</p>
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients//表示启用feign
public class FeignApp {

    public static void main(String[] args) {
        SpringApplication.run(FeignApp.class,args);
    }
    /* *
     * @Author lsc
     * <p>
     https://github.com/OpenFeign/feign
     * https://cloud.spring.io/spring-cloud-static/Finchley.SR4/single/spring-cloud.html
     * </p>
     * @Param
     * @Return
     */
}
