package com.alibaba.dubbo.test.service.impl;

import com.alibaba.dubbo.test.service.MouseService;

/**
 * Created by ken.lj on 2017/9/8.
 */

public class MouseServiceImpl implements MouseService {
    @Override
    public void eat(String master) {
        System.out.println(master + " eat me.");
    }

    @Override
    public String getName() {
        return "Mickey mouse";
    }
}
