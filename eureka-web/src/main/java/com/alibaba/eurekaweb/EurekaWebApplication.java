package com.alibaba.eurekaweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
//启用feign进行远程调用
@EnableFeignClients
public class EurekaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaWebApplication.class, args);
	}

}
