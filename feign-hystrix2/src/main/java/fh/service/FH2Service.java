package fh.service;

import fh.service.impl.FH2ServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author lsc
 * <p> </p>
 */
@FeignClient( name = "eureka-client", value = "eureka-client", fallback = FH2ServiceFallback.class)
public interface FH2Service {

    @GetMapping("zszxz/fh")
    public String getFeign(String username);

}
