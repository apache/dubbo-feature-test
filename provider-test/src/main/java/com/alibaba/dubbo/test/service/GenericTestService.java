package com.alibaba.dubbo.test.service;

import java.util.Map;
import java.util.Set;

/**
 * @author ken.lj
 * @date 2017/10/22
 */
public interface GenericTestService {

    public void testGenericWithJsonSerialization(Map<String, Set<String>> params);
}
