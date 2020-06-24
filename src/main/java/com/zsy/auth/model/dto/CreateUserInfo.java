package com.zsy.auth.model.dto;

import lombok.Data;

@Data
public class CreateUserInfo {
    private int userId;
    private String userName;
    private String password;
    private String nickName;
    private String email;
    private String sex;
}
