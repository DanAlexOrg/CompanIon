package com.danalex.balance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CompanionBalanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanionBalanceApplication.class, args);
	}

}
