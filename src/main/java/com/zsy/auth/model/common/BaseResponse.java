package com.zsy.auth.model.common;

import lombok.Data;

@Data
public class BaseResponse<T> {
    private int code;

    private String msg;

    private T data;

    public BaseResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
