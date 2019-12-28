package com.zszxz.feign.service;

import com.zszxz.feign.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author lsc
 * <p> </p>
 */
@FeignClient( name = "eureka-client", value = "eureka-client",configuration = FeignConfiguration.class)
public interface FeignService {

    @GetMapping("zszxz/feign")
    public String getFeign();

}
