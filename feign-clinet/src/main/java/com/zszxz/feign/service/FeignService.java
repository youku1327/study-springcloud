package com.zszxz.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author lsc
 * <p> </p>
 */
@FeignClient( name = "eureka-client", value = "eureka-client")
public interface FeignService {

    @GetMapping("zszxz/feign")
    public String getFeign();

}
