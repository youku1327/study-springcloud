package com.zszxz.fh.service;

import com.zszxz.fh.service.impl.FHServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author lsc
 * <p> </p>
 */
@FeignClient( name = "eureka-client", value = "eureka-client", fallback = FHServiceFallback.class)
public interface FHService {

    @GetMapping("zszxz/fh")
    public String getFeign(String username);

}
