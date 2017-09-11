package com.alibaba.dubbo.test.service;

import com.alibaba.dubbo.test.dto.Bait;

/**
 * Created by ken.lj on 2017/9/8.
 */
public interface CatService {
    void eat(Bait bait);

    void getName();
}
