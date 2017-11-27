package com.alibaba.dubbo.test.service;

import com.alibaba.dubbo.test.dto.hession.BaseUser;
import com.alibaba.dubbo.test.dto.hession.GrandsonUser;
import com.alibaba.dubbo.test.dto.hession.SubUser;

/**
 * @author ken.lj
 * @date 2017/11/4
 */
public interface HessianService {
    String hello();

    /**
     * 下面这三个方法为了验证参数bean有覆盖父类的属性时候，传递的数据为null
     * @param subUser
     * @return
     */
    String getBaseUserName(BaseUser subUser);
    String getSubUserName(SubUser subUser);
    String getSubSonUserName(GrandsonUser subUser);
}
