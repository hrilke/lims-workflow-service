package com.capstone.lims.workflow_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WorkflowServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkflowServiceApplication.class, args);
	}

}
