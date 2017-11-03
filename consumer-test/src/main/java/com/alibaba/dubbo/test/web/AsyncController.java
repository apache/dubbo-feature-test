package com.alibaba.dubbo.test.web;

import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.test.service.AsyncService;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

/**
 * @author ken.lj
 * @date 2017/11/3
 */
@RestController
@RequestMapping("/async")
public class AsyncController {
    @Autowired(required = false)
    private AsyncService asyncService;

    @RequestMapping("/hello")
    public String testSimple() throws Exception {
        String result = asyncService.asyncMethod();
        Assert.assertNull(result);
        Future<String> future = RpcContext.getContext().getFuture();

        return future.get();
    }
}
