package com.alibaba.dubbo.test.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.test.service.AnnotateService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ken.lj
 * @date 2017/09/10
 */
@RestController("annotation")
public class AnnotationParentReferenceController extends BaseController<AnnotateService> {

    @Reference
    public AnnotateService annotateServiceSub;

    @RequestMapping("/subclass")
    String subHello() {
        return annotateServiceSub.sayHello();
    }

}
