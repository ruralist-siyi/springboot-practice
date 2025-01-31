package com.zsy.auth.model.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Integer userId;
    private String userName;
    private String nickName;
    private String email;
    private String sex;
}
