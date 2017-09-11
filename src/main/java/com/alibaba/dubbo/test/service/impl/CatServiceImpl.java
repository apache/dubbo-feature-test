package com.alibaba.dubbo.test.service.impl;

import com.alibaba.dubbo.test.dto.Bait;
import com.alibaba.dubbo.test.service.CatService;
import com.alibaba.dubbo.test.service.MouseService;

import org.springframework.stereotype.Service;

/**
 * Created by ken.lj on 2017/9/8.
 */
@Service("catService")
public class CatServiceImpl implements CatService {

    private MouseService mouseService;

    @Override
    public void eat(Bait bait) {

    }

    @Override
    public void getName() {

    }
}
