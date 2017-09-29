package com.alibaba.dubbo.test.web;

import com.alibaba.dubbo.test.service.AnnotateService;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ken.lj on 2017/9/19.
 */
public class BaseController<T extends AnnotateService> {

    public T annotateService;

    @RequestMapping("/hello")
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
