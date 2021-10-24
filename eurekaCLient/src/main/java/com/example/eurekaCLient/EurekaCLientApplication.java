package com.example.eurekaCLient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaCLientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaCLientApplication.class, args);
	}

}
