package com.alibaba.dubbo.test.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.test.service.AnnotateService;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试Reference支持父类属性注入
 * @author ken.lj
 * @date 2017/09/10
 */
public class BaseController<T extends AnnotateService> {

    @Reference
    public T annotateService;

    @RequestMapping("/parentclass")
    String hello() {
        return annotateService.sayHello();
    }

    public T getAnnotateService() {
        return annotateService;
    }

    public void setAnnotateService(T annotateService) {
        this.annotateService = annotateService;
    }
}
