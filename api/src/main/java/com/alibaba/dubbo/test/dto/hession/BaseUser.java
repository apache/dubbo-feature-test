package com.alibaba.dubbo.test.dto.hession;

import java.io.Serializable;

/**
 * Created by lovepoem on 2017/11/27.
 */
public class BaseUser implements Serializable {
    private static final long serialVersionUID = 9104092580669691633L;
    private Integer userId;
    private String userName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
