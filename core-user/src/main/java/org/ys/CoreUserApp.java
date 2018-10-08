package org.ys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
//@EnableHystrix
@SpringBootApplication
@MapperScan("org.ys.cms.dao")
public class CoreUserApp {
	
	public static void main(String[] args) {
		SpringApplication.run(CoreUserApp.class, args);
	}
//	  @Bean
//	  public RestTemplate restTemplate() {
//	    return new RestTemplate();
//	  }
}



