package com.alibaba.dubbo.test.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.test.service.AnnotateService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ken.lj on 2017/9/19.
 */
@RestController
public class HelloController extends BaseController<AnnotateService> {


}
