package com.alibaba.dubbo.test.service.impl;

import com.alibaba.dubbo.test.dto.Bean;
import com.alibaba.dubbo.test.dto.SubMap;
import com.alibaba.dubbo.test.service.DemoService;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by ken.lj on 2017/9/24.
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String testString(String str) {
        return str;
    }

    @Override
    public Bean testPojo(Bean bean) {
        return bean;
    }

    @Override
    public List<Bean> testList(List<Bean> list) {
        return list;
    }

    @Override
    public Map<String, Object> testMap(Map<String, Object> map) {
        return map;
    }

    @Override
    public Map<String, Object> testTelnetSubMap(SubMap subMap) {
        return subMap;
    }

    /*@Override
    public LocalDateTime testJava8Time(LocalDateTime instant) {
        return instant;
    }

    @Override
    public ZonedDateTime testJava8Time(ZonedDateTime zonedDateTime) {
        return zonedDateTime;
    }*/

}
