package com.zsy.auth.service.impl;

import com.zsy.auth.mapper.UserMapper;
import com.zsy.auth.model.dto.CreateUserInfo;
import com.zsy.auth.model.dto.UpdateUserInfo;
import com.zsy.auth.model.entity.User;
import com.zsy.auth.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper UserMapper;

    @Override
    public User findById(Integer id) {
        return UserMapper.findById(id);
    }

    @Override
    public CreateUserInfo createUser(CreateUserInfo user) {
        UserMapper.createUser(user);
        return user;
    }

    @Override
    public void deleteUser(int id) {
        UserMapper.deleteUser(id);
    }

    @Override
    public void updateUser(UpdateUserInfo userInfo) {
        UserMapper.updateUser(userInfo);
    }
}
