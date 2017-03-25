package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MmbEurekaClientSubjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmbEurekaClientSubjectApplication.class, args);
	}
}
