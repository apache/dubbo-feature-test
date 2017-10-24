package com.alibaba.dubbo.test.service.chain.impl;


import com.alibaba.dubbo.test.service.chain.CatService;
import com.alibaba.dubbo.test.service.chain.MouseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ken.lj
 * @date 2017/09/10
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
