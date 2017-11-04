package com.alibaba.dubbo.test.service.impl;

import com.alibaba.dubbo.test.service.AnnotateService;

/**
 * @author ken.lj
 * @date 2017/09/10
 */
@com.alibaba.dubbo.config.annotation.Service(timeout = 5000, application = "provider-test")
public class AnnotateServiceImpl implements AnnotateService {

    @Override
    public String sayHello() {
        return "Hello";
    }
}
