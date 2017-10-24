package com.alibaba.dubbo.test.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author ken.lj
 * @date 2017/09/10
 */
@Configuration
@ImportResource(locations = {"classpath:dubbo-common.xml", "classpath:dubbo-${config.file}.xml"})
public class DubboConfiguration {

}
