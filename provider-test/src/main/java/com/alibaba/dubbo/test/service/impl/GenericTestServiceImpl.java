package com.alibaba.dubbo.test.service.impl;

import com.alibaba.dubbo.test.service.GenericTestService;

import java.util.Map;
import java.util.Set;

/**
 * @author ken.lj
 * @date 2017/09/10
 */
public class GenericTestServiceImpl implements GenericTestService {
    @Override
    public void testGenericWithJsonSerialization(Map<String, Set<String>> params) {
        Set<String> set = params.get("key");
        System.out.print(set);
    }
}
