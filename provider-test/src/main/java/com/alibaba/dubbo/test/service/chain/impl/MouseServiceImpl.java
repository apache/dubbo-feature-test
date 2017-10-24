package com.alibaba.dubbo.test.service.chain.impl;

import com.alibaba.dubbo.test.service.chain.MouseService;

import org.springframework.stereotype.Service;

/**
 * @author ken.lj
 * @date 2017/09/10
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
