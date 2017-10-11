package com.alibaba.dubbo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ConsumerTestApp {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(ConsumerTestApp.class, args);
		Thread.sleep(100000000);
	}
}
