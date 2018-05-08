package com.example.eurekaspringcloudfinchleyrc1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaSpringCloudFinchleyRc1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSpringCloudFinchleyRc1Application.class, args);
	}
}
