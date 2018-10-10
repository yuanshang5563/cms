package org.ys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableEurekaClient
//@EnableHystrix
@EnableHystrixDashboard
@EnableTurbine
@SpringBootApplication
public class CmsTurbineApp {
	
	public static void main(String[] args) {
		SpringApplication.run(CmsTurbineApp.class, args);
	}
	
}



