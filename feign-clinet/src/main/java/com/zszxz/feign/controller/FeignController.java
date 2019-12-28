package com.zszxz.feign.controller;

import com.zszxz.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lsc
 * <p> feign 表现层 </p>
 */
@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @GetMapping("zszxz/feign")
    public String getFeign(){
        // 调用 getFeign方法
        return feignService.getFeign();
    }
}
