package com.alibaba.dubbo.test.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.test.service.AnnotateService;

import org.springframework.transaction.annotation.Transactional;


/**
 * Created by ken.lj on 2017/9/19.
 */
@Service
public class AnnotateServiceImpl implements AnnotateService {
    @Override
    @Transactional
    public String sayHello() {
        return "Hello";
    }
}
