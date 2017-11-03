package com.alibaba.dubbo.test.service.impl;

import com.alibaba.dubbo.test.dto.Bean;
import com.alibaba.dubbo.test.dto.SubMap;
import com.alibaba.dubbo.test.service.DemoService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author ken.lj
 * @date 2017/09/10
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {
    @Override
    @Transactional
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
