package com.alibaba.dubbo.test;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
@DubboComponentScan(basePackages = "com.alibaba.dubbo.test.service.impl")
public class ProviderTestApp {

	public static void main(String[] args) throws InterruptedException {
		new SpringApplicationBuilder(ProviderTestApp.class).web(false).run(args);
	}
}
