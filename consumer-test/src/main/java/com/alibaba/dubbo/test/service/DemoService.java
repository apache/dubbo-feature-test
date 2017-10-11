package com.alibaba.dubbo.test.service;

import com.alibaba.dubbo.test.dto.Bean;

import java.util.List;
import java.util.Map;

/**
 * Created by ken.lj on 2017/9/24.
 */
public interface DemoService {
    String testString(String str);

    boolean testPojo(Bean bean);

    boolean testList(List<Bean> list);

    boolean testMap(Map<String, Object> map);

    Bean testResult(Bean bean);
}
