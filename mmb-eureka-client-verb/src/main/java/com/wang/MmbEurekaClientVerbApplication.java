package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MmbEurekaClientVerbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmbEurekaClientVerbApplication.class, args);
	}
}
