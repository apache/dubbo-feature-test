package com.alibaba.dubbo.test.service.impl;

import com.alibaba.dubbo.test.service.MouseService;

import org.springframework.stereotype.Service;

/**
 * Created by ken.lj on 2017/9/8.
 */

public class MouseServiceImpl implements MouseService {
    @Override
    public void eat() {

    }

    @Override
    public String getName() {
        return "Mickey mouse";
    }
}
