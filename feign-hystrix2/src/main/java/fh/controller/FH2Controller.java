package fh.controller;

import fh.service.FH2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lsc
 * <p> feign 表现层 </p>
 */
@RestController
public class FH2Controller {

    @Autowired
    FH2Service fh2Service;

    @GetMapping("zszxz/feign")
    public String getFeign(String username){
        // 调用 getFeign方法
        return fh2Service.getFeign(username);
    }
}
