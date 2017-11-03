package com.alibaba.dubbo.test.web;

import com.alibaba.dubbo.rpc.service.GenericService;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author ken.lj
 * @date 2017/11/3
 */
@RestController
@RequestMapping("/simple")
public class GenericReferenceController implements ApplicationContextAware {

    private ApplicationContext context;

    @RequestMapping("/reference/generic")
    public String testReferenceGeneric() {
        GenericService genericService = (GenericService) context.getBean("genericTestService");
        Map<String, Set<String>> map = new HashMap<String, Set<String>>();
        Set<String> set = new HashSet<String>();
        set.add("v1");
        set.add("v2");
        map.put("key", set);
        Object result = genericService.$invoke("testGenericWithJsonSerialization", new String[]{"java.util.Map"}, new Object[]{map});
        return "generic";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
