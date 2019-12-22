package com.zszxz.eureka.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lsc
 * <p> 知识追寻者，ribbon provider the restful api</p>
 */
@RestController
public class RibbonProvidderController {


    @GetMapping("zszxz/ribbon")
    public String testRibbon(){
        return "hell i am zszxz";
    }
}
