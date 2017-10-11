package com.alibaba.dubbo.test.service.impl;

import com.alibaba.dubbo.test.dto.Bean;
import com.alibaba.dubbo.test.service.DemoService;

import java.util.List;
import java.util.Map;

/**
 * Created by ken.lj on 2017/9/24.
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String testString(String str) {
        return null;
    }

    @Override
    public boolean testPojo(Bean bean) {
        return false;
    }

    @Override
    public boolean testList(List<Bean> list) {
        return false;
    }

    @Override
    public boolean testMap(Map<String, Object> map) {
        return false;
    }

    @Override
    public Bean testResult(Bean bean) {
        return null;
    }
}
