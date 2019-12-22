package com.zszxz.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author lsc
 * <p> </p>
 */
@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;


    public String testRibbon(){
        return restTemplate.getForObject("http://eureka-client/zszxz/ribbon",String.class);
    }
}
