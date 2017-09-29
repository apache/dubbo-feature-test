package com.alibaba.dubbo.test.service.impl;

import com.alibaba.dubbo.test.service.AnnotateService;

import org.springframework.stereotype.Service;

/**
 * Created by ken.lj on 2017/9/19.
 */
public class AnnotateServiceImpl implements AnnotateService {
    @Override
    public String sayHello() {
        return "Hello";
    }
}
