package com.zsy.auth.controller;

import com.zsy.auth.model.entity.User;
import com.zsy.auth.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService UserService;

    @GetMapping("/queryUserInfo")
    public User queryUserInfo(@Param("id") Integer id) {
        User userInfo = UserService.findById(id);
        return userInfo;
    }
}
