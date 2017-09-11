package com.alibaba.dubbo.test.service.impl;

import com.alibaba.dubbo.test.service.CatService;
import com.alibaba.dubbo.test.service.DogService;
import com.alibaba.dubbo.test.service.MouseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ken.lj on 2017/9/8.
 */
@Service("dogService")
public class DogServiceImpl implements DogService {
    @Autowired
    private CatService catService;

    @Autowired
    private MouseService mouseService;

    @Override
    public void eat(String master) {
        System.out.println(master + " eat me.");
        catService.eat("cat");
        mouseService.eat("mouse");
    }

    @Override
    public String getName() {
        return "Hachiko Dog";
    }
}
