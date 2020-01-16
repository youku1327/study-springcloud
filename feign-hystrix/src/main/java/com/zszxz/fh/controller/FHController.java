package com.zszxz.fh.controller;

import com.zszxz.fh.service.FHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lsc
 * <p> feign 表现层 </p>
 */
@RestController
public class FHController {

    @Autowired
    FHService fhService;

    @GetMapping("zszxz/feign")
    public String getFeign(String username){
        // 调用 getFeign方法
        return fhService.getFeign(username);
    }
}
