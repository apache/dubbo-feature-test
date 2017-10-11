package com.alibaba.dubbo.test.service.chain.impl;

import com.alibaba.dubbo.test.service.chain.MouseService;

import org.springframework.stereotype.Service;

/**
 * Created by ken.lj on 2017/9/8.
 */
@Service("mouseService")
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
