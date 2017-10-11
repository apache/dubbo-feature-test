package com.alibaba.dubbo.test.web;

import com.alibaba.dubbo.test.service.AnnotateService;
import com.alibaba.dubbo.test.service.AsyncService;
import com.alibaba.dubbo.test.service.CacheService;
import com.alibaba.dubbo.test.service.DemoService;
import com.alibaba.dubbo.test.service.WSService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ken.lj on 2017/9/25.
 */
@RestController
@RequestMapping("/testcase")
public class TestcaseController {

    private DemoService demoService;
    private AsyncService asyncService;
    private CacheService cacheService;
    private WSService wsService;
    private AnnotateService annotateService;

    @RequestMapping("/all")
    public String testAll() {
        return "all";
    }

    @RequestMapping("/async")
    public String testAsync() {
        return "async";
    }

    @RequestMapping("/cache")
    public String testCache() {
        return "cache";
    }

    @RequestMapping("/simple")
    public String testSimple() {
        String result = demoService.testString("hello");
        System.out.println(result);
        return "DemoService string";
    }

    @RequestMapping("/annotate")
    public String testAnnotate() {
        return "annotate";
    }
}
