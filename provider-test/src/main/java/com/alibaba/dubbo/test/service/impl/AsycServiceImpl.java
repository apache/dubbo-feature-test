package com.alibaba.dubbo.test.service.impl;

import com.alibaba.dubbo.test.service.AsyncService;

import org.springframework.stereotype.Service;

/**
 * @author ken.lj
 * @date 2017/09/10
 */
@Service("asyncService")
public class AsycServiceImpl implements AsyncService{

    @Override
    public String asyncMethod() {
        return null;
    }

}
