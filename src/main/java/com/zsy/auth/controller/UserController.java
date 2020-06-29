package com.zsy.auth.controller;

import com.zsy.auth.model.common.BaseResponse;
import com.zsy.auth.model.dto.CreateUserInfo;
import com.zsy.auth.model.dto.UpdateUserInfo;
import com.zsy.auth.model.entity.User;
import com.zsy.auth.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService UserService;

    @GetMapping("/queryUserInfo")
    public BaseResponse queryUserInfo(@Param("id") Integer id) {
        User userInfo = UserService.findById(id);
        return new BaseResponse<User>(200, "成功", userInfo);
    }

    @PostMapping("/create")
    public BaseResponse createUser(@RequestBody CreateUserInfo user) {
        CreateUserInfo newUserInfo = UserService.createUser(user);
        return new BaseResponse<CreateUserInfo>(200, "创建成功", newUserInfo);
    }

    @DeleteMapping("/delete")
    public BaseResponse deleteUser(@RequestParam(value = "userId") Integer userId) {
        UserService.deleteUser(userId);
        return new BaseResponse<Map>(200, "删除成功", null);
    }

    @PostMapping("/update")
    public BaseResponse updateUser(@RequestBody UpdateUserInfo userInfo) {
        UserService.updateUser(userInfo);
        return new BaseResponse<Map>(200, "修改成功", null);
    }
}
