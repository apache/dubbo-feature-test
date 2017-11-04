package com.alibaba.dubbo.test.web;

import com.alibaba.dubbo.test.service.HessianService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ken.lj
 * @date 2017/11/4
 */
@RestController
@RequestMapping("/hessian")
public class HessianController {

    @Autowired(required = false)
    private HessianService hessianService;

    @RequestMapping("/hello")
    public String testSimple() {
        String result = hessianService.hello();
        return result;
    }
}
