package com.orag.managment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OragManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(OragManagmentApplication.class, args);
	}

}
