package com.alibaba.dubbo.test.service.impl;

import com.alibaba.dubbo.test.service.CatService;
import com.alibaba.dubbo.test.service.DogService;
import com.alibaba.dubbo.test.service.MouseService;

import org.springframework.stereotype.Service;

/**
 * Created by ken.lj on 2017/9/8.
 */
@Service("dogService")
public class DogServiceImpl implements DogService {
    private CatService catService;

    private MouseService mouseService;

    @Override
    public void eat() {

    }

    @Override
    public void getName() {

    }
}
