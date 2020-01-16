package com.zszxz.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author lsc
 * <p> </p>
 */
@Component
public class UserService {

    // 为getUser方法添加容错回调处理
    @HystrixCommand(fallbackMethod = "defaultUser")
    public String getUser(String params){
        if (params.equals("zszxz")){
            return "the user is zszxz";
        }else {
            // 抛出异常时会直接调用fallbackMethod中指定的方法
            throw new RuntimeException();
        }
    }
    /* *
     * @Author lsc
     * <p> 出错回调处理</p>
     * @Param [params]
     * @Return java.lang.String
     */
    public String defaultUser(String params){
        return "it is the user thar is not exist in project";
    }
}
