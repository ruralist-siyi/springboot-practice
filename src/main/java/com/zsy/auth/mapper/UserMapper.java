package com.zsy.auth.mapper;

import com.zsy.auth.model.dto.CreateUserInfo;
import com.zsy.auth.model.dto.UpdateUserInfo;
import com.zsy.auth.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User findById(Integer id);

    public int createUser(CreateUserInfo user);

    public void deleteUser(int id);

    public void updateUser(UpdateUserInfo userInfo);
}