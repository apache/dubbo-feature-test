package com.alibaba.dubbo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProviderTestApp {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(ProviderTestApp.class, args);
		Thread.sleep(100000000);
	}
}
