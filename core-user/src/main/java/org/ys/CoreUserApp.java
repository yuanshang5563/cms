package org.ys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("org.ys.cms.dao")
public class CoreUserApp {
	
	public static void main(String[] args) {
		SpringApplication.run(CoreUserApp.class, args);
	}
	
}



