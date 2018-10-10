package org.ys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class CmsZuulApp {
	
	public static void main(String[] args) {
		SpringApplication.run(CmsZuulApp.class, args);
	}
	
}



