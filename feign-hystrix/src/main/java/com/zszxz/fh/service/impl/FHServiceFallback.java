package com.zszxz.fh.service.impl;

import com.zszxz.fh.service.FHService;
import org.springframework.stereotype.Component;

/**
 * @Author lsc
 * <p> </p>
 */
@Component
public class FHServiceFallback implements FHService {
    @Override
    public String getFeign(String username) {

        return "sorry feilure,you can try it again";
    }
}
