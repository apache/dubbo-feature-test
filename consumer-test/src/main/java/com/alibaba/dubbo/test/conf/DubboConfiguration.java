package com.alibaba.dubbo.test.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by ken.lj on 2017/9/10.
 */
@Configuration
@ImportResource(locations = {"classpath:dubbo-common.xml", "classpath:dubbo-${spring.profiles.active}.xml"})
public class DubboConfiguration {

}
