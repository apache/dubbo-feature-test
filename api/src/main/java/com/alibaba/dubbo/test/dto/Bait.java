package com.alibaba.dubbo.test.dto;

import java.io.Serializable;

/**
 * Created by ken.lj on 2017/9/8.
 */
public class Bait implements Serializable {
    private int id;

    private boolean cook ;

    private String taste;

    Bait() {}

    Bait(int id, String taste) {
        this(id, false, taste);
    }

    Bait(int id, boolean cook, String taste) {
        this.id = id;
        this.cook = cook;
        this.taste = taste;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCook() {
        return cook;
    }

    public void setCook(boolean cook) {
        this.cook = cook;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
