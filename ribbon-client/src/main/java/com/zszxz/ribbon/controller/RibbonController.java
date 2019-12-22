package com.zszxz.ribbon.controller;

import com.zszxz.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lsc
 * <p> </p>
 */
@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @GetMapping("ribbon/test")
    public String testRibbon(){
        return ribbonService.testRibbon();
    }

    @Autowired
    LoadBalancerClient loadBalanced;

    @GetMapping("ribbon")
    public String ribbon(){
        ServiceInstance choose = loadBalanced.choose("eureka-client");
        String s = "host is :" + choose.getHost() + "  port is :" + choose.getPort();
        System.out.println(s);
        return s;
    }

}
