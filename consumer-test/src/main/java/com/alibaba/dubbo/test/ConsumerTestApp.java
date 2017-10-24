package com.alibaba.dubbo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ken.lj
 * @date 2017/09/10
 */
@SpringBootApplication
public class ConsumerTestApp {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(ConsumerTestApp.class, args);
		Thread.sleep(100000000);
	}
}
