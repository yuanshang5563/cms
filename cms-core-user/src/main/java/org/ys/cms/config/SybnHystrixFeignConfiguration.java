package org.ys.cms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import feign.Feign;
import feign.hystrix.HystrixFeign;

@Configuration
public class SybnHystrixFeignConfiguration {
	@Bean
	@Scope("prototype")
	public Feign.Builder feignHystrixBuilder() {
		return HystrixFeign.builder();
	}

}
