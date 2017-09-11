package com.alibaba.dubbo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DubboFeatureTestApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(DubboFeatureTestApplication.class, args);
		Thread.sleep(100000000);
	}
}
