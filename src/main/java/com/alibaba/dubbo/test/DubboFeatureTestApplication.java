package com.alibaba.dubbo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;


@SpringBootApplication
@ComponentScan(basePackages = {"com.alibaba.dubbo.test"}, includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {com.alibaba.dubbo.config.annotation.Service.class, com.alibaba.dubbo.config.annotation.Reference.class})})
public class DubboFeatureTestApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(DubboFeatureTestApplication.class, args);
		Thread.sleep(100000000);
	}
}
