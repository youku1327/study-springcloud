package com.zszxz.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author lsc
 * <p> ribbon-restTemplate配置 </p>
 */
@Configuration
public class RibbonConfig {

    @Bean
    @LoadBalanced//表示用于负载均衡
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
