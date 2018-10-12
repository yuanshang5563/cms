package org.ys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CmsFileApp {
	
	public static void main(String[] args) {
		SpringApplication.run(CmsFileApp.class, args);
	}
	
}



