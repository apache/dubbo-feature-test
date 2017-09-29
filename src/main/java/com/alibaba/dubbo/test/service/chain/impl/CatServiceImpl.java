package com.alibaba.dubbo.test.service.chain.impl;

import com.alibaba.dubbo.test.service.CatService;
import com.alibaba.dubbo.test.service.MouseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ken.lj on 2017/9/8.
 */
@Service("catService")
public class CatServiceImpl implements CatService {

    @Autowired
    private MouseService mouseService;

    @Override
    public void eat(String master) {
        System.out.println(master + " eat me.");
        mouseService.eat("Cat");
    }

    @Override
    public String getName() {
        return "Tom Cat";
    }
}
