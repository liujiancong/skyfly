package com.cong.skyfly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SkyflyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkyflyApplication.class, args);
	}
}
