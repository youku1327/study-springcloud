package com.zszxz.eureka.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lsc
 * <p> 知识追寻者 Feign 服务消费</p>
 */
@RestController
public class FeignProvoderController {

    @GetMapping("zszxz/feign")
    public String getFeign(){
        return "the get method of feign test";
    }
}
