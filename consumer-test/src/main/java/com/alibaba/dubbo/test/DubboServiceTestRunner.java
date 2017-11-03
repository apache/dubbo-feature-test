package com.alibaba.dubbo.test;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.service.GenericService;
import com.alibaba.dubbo.test.service.AnnotateService;
import com.alibaba.dubbo.test.service.AsyncService;
import com.alibaba.dubbo.test.service.DemoService;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 自动执行一遍所有服务调用
 *
 * @author ken.lj
 * @date 2017/11/3
 */
@Service
public class DubboServiceTestRunner implements ApplicationContextAware {
    Logger logger = LoggerFactory.getLogger(DubboServiceTestRunner.class);
    private ApplicationContext context;

    @Autowired
    private DemoService demoService;

    @Autowired
    private AsyncService asyncService;

    @Reference
    private AnnotateService annotateService;

    @PostConstruct
    public void start() {
        logger.info("******  start testcase!  ******");
        try {
            runSimple();
            runAync();
            runAnnotate();
            runGeneric();
        } catch (Throwable t) {
            logger.error("有测试用例报错，请检查！", t);
        }
    }

    public void runSimple() {
        demoService.testString("string param");
    }

    public void runAync() {
        asyncService.asyncMethod();
    }

    public void runAnnotate() {
        annotateService.sayHello();
    }

    public void runGeneric() {
        GenericService genericService = (GenericService) context.getBean("genericTestService");
        Map<String, Set<String>> map = new HashMap<String, Set<String>>();
        Set<String> set = new HashSet<String>();
        set.add("v1");
        set.add("v2");
        map.put("key", set);
        Object result = genericService.$invoke("testGenericWithJsonSerialization", new String[]{"java.util.Map"}, new Object[]{map});
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
