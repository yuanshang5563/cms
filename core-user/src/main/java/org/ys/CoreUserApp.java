package org.ys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CoreUserApp {
	
	public static void main(String[] args) {
		SpringApplication.run(CoreUserApp.class, args);
	}
	
}



