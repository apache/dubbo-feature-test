package com.alibaba.dubbo.test.dto;

import java.io.Serializable;

/**
 * Created by ken.lj on 2017/9/24.
 */
public class Bean implements Serializable {
    private int id;

    private String name;

    public Bean() {
    }

    public Bean(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
