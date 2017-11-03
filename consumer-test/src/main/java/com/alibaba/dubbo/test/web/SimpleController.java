package com.alibaba.dubbo.test.web;

import com.alibaba.dubbo.test.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ken.lj
 * @date 2017/09/10
 */
@RestController
@RequestMapping("/simple")
public class SimpleController {

    @Autowired(required = false)
    private DemoService demoService;

    @RequestMapping("/hello")
    public String testSimple() {
        String result = demoService.testString("hello");
        System.out.println(result);
        return "DemoService string";
    }

}
