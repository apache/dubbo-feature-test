package com.alibaba.dubbo.test.service.chain.impl;

import com.alibaba.dubbo.test.service.CatService;
import com.alibaba.dubbo.test.service.DogService;
import com.alibaba.dubbo.test.service.LionService;
import com.alibaba.dubbo.test.service.MouseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ken.lj on 2017/9/8.
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
