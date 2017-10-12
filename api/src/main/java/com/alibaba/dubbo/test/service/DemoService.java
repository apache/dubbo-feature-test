package com.alibaba.dubbo.test.service;

import com.alibaba.dubbo.test.dto.Bean;

import java.util.List;
import java.util.Map;

/**
 * Created by ken.lj on 2017/9/24.
 */
public interface DemoService {
    String testString(String str);

    Bean testPojo(Bean bean);

    List<Bean> testList(List<Bean> list);

    Map<String, Object> testMap(Map<String, Object> map);

    /*LocalDateTime testJava8Time(LocalDateTime instant);

    ZonedDateTime testJava8Time(ZonedDateTime zonedDateTime);*/
}
