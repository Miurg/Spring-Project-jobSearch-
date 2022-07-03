package com.example.jobSearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class JobSearchApplication {

	public static void main(String[] args) {
//		SpringApplication application = new SpringApplication(JobSearchApplication.class);
//		application.setWebApplicationType(WebApplicationType.NONE);
//		application.run(args);
		SpringApplication.run(JobSearchApplication.class, args);
	}

}
