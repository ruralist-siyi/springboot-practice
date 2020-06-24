package com.zsy.auth.controller;

import com.zsy.auth.model.dto.CreateUserInfo;
import com.zsy.auth.model.entity.User;
import com.zsy.auth.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/create")
    public CreateUserInfo createUser(@RequestBody CreateUserInfo user) {
        System.out.println(user);
        CreateUserInfo newUserInfo = UserService.createUser(user);
        return newUserInfo;
    }
}
