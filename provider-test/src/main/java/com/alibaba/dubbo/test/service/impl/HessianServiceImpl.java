package com.alibaba.dubbo.test.service.impl;

import com.alibaba.dubbo.test.dto.hession.BaseUser;
import com.alibaba.dubbo.test.dto.hession.GrandsonUser;
import com.alibaba.dubbo.test.dto.hession.SubUser;
import com.alibaba.dubbo.test.service.HessianService;

import org.springframework.stereotype.Service;

/**
 * @author ken.lj
 * @date 2017/11/4
 */
@Service("hessianService")
public class HessianServiceImpl implements HessianService {
    @Override
    public String hello() {
        return "hessian";
    }

    @Override
    public String getBaseUserName(BaseUser user) {
        return user.getUserName();
    }

    @Override
    public String getSubUserName(SubUser user) {
        return user.getUserName();
    }

    @Override
    public String getSubSonUserName(GrandsonUser user) {
        return user.getUserName();
    }
}
