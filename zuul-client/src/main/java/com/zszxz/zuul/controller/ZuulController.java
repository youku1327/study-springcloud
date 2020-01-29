package com.zszxz.zuul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lsc
 * <p>zuul 路由网关测试表现层 </p>
 */
@RestController
public class ZuulController {

    @RequestMapping("/zszxz")
    public String getUser(String username){
        return "hello"+username;
    }
}
