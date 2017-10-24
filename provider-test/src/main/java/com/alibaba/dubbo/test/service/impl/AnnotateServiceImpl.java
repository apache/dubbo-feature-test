package com.alibaba.dubbo.test.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.test.service.AnnotateService;

import org.springframework.transaction.annotation.Transactional;


/**
 * @author ken.lj
 * @date 2017/09/10
 */
@Service
public class AnnotateServiceImpl implements AnnotateService {
    @Override
    @Transactional
    public String sayHello() {
        return "Hello";
    }
}
