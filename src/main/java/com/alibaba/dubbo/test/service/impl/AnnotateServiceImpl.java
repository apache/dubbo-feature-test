package com.alibaba.dubbo.test.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.test.service.AnnotateService;

/**
 * Created by ken.lj on 2017/9/19.
 */
@Service
public class AnnotateServiceImpl implements AnnotateService {
    @Override
    public String sayHello() {
        return "Hello";
    }
}
