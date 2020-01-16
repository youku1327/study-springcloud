package com.zszxz.hystrix.controller;

import com.zszxz.hystrix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lsc
 * <p> </p>
 */
@RestController
public class UserController {

    @Autowired
    UserService  userService;

    @GetMapping("user")
    public String getUser(String username){
        return userService.getUser(username);
    }
}
