package com.alibaba.dubbo.test.service.chain.impl;

import com.alibaba.dubbo.test.service.chain.CatService;
import com.alibaba.dubbo.test.service.chain.DogService;
import com.alibaba.dubbo.test.service.chain.LionService;
import com.alibaba.dubbo.test.service.chain.MouseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ken.lj
 * @date 2017/09/10
 */
@Service("lionService")
public class LionServiceImpl implements LionService {
    @Autowired
    private CatService catService;

    @Autowired
    private MouseService mouseService;

    @Autowired
    private DogService dogService;

    @Override
    public void eat(String master) {
        System.out.println(master + " eat me.");
        dogService.eat("dog");
        catService.eat("cat");
        mouseService.eat("mouse");
    }

    @Override
    public String getName() {
        return "Simba Lion";
    }
}
