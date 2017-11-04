package com.alibaba.dubbo.test.service.impl;

import com.alibaba.dubbo.test.service.HessianService;

import org.springframework.stereotype.Service;

/**
 * @author ken.lj
 * @date 2017/11/4
 */
@Service("hessianService")
public class HessianServiceImpl implements HessianService {
    @Override
    public String hello() {
        return "hessian";
    }
}
