package com.zsy.auth.service;

import com.zsy.auth.model.dto.CreateUserInfo;
import com.zsy.auth.model.entity.User;

public interface UserService {
    public User findById(Integer id);
    public CreateUserInfo createUser(CreateUserInfo user);
}
