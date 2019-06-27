package com.example.adithya.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerStudentApplication.class, args);
	}

}
