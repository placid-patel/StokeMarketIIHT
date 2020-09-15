package com.example.patel.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaDiscoveryServerhpApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoveryServerhpApplication.class, args);
	}

}
