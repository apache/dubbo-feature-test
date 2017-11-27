package com.alibaba.dubbo.test.service;

import com.alibaba.dubbo.test.dto.hession.BaseUser;
import com.alibaba.dubbo.test.dto.hession.GrandsonUser;
import com.alibaba.dubbo.test.dto.hession.SubUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wx
 * Created by lovepoem on 2017/11/27.
 * hession序列化的测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HessianServiceTest {
    @Autowired
    private HessianService hessianService;

    @Test
    public void testGetBaseUserName() {

        BaseUser baseUser = new BaseUser();
        baseUser.setUserId(1);
        baseUser.setUserName("tom");
        String baseUserName = hessianService.getBaseUserName(baseUser);
        Assert.assertEquals("tom", baseUserName);
    }

    @Test
    public void testGetSubUserName() {
        SubUser subUser = new SubUser();
        subUser.setUserId(1);
        subUser.setUserName("tom");
        String subUserName = hessianService.getSubUserName(subUser);
        Assert.assertEquals("tom", subUserName);

    }

    @Test
    public void testGetGrandsonUserName() {
        GrandsonUser grandsonUser = new GrandsonUser();
        grandsonUser.setUserId(1);
        grandsonUser.setUserName("tom");
        String grandsonUserName = hessianService.getSubSonUserName(grandsonUser);
        Assert.assertEquals("tom", grandsonUserName);
    }
}
