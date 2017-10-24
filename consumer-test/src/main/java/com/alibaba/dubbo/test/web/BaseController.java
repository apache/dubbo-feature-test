package com.alibaba.dubbo.test.web;

import com.alibaba.dubbo.test.service.AnnotateService;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ken.lj
 * @date 2017/09/10
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
