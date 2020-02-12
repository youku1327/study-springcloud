package com.zszxz.config.client.controller;

import com.zszxz.config.client.config.ZszxzConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lsc
 * <p> </p>
 */
@RestController
@RefreshScope
public class ConfigController {

    @Autowired
    private ZszxzConfigProperties zszxzConfigProperties;

    @Value("${zszxz.springcloud.config}")
    private String value;

    @GetMapping("/zszxz/config")
    public String getConfig(){
        String config = zszxzConfigProperties.getZszxz();
        System.out.println(config);
        return value;
    }
}
