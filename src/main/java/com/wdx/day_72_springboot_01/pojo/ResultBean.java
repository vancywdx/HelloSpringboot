package com.wdx.day_72_springboot_01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by wdx on 2019/10/22 11:54
 */
@Data
@AllArgsConstructor
public class ResultBean<T> {
    private String statusCode;
    private T data;

    /*public ResultBean(String statusCode, T data) {
        this.statusCode = statusCode;
        this.data = data;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }*/
}
