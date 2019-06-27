package com.example.adithya.ZuulStudentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulStudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulStudentServiceApplication.class, args);
	}
	
	@Bean
	public SamplePreFilter getSamplePreFilter() {
		return new SamplePreFilter();
	}
	
	@Bean
	public SamplePostFilter geSamplePostFilter() {
		return new SamplePostFilter();
	}
	

}
