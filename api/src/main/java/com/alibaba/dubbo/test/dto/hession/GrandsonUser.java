package com.alibaba.dubbo.test.dto.hession;

import java.io.Serializable;

/**
 * Created by lovepoem on 2017/11/27.
 */
public class GrandsonUser extends SubUser implements Serializable {
    private static final long serialVersionUID = 5013145666993778451L;
    private String userName;

    @Override
    public String getUserName() {
        return userName;
    }
    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
