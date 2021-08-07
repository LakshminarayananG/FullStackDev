package com.practice.javaConfigOtherTry;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	public Inventory inventory() {
		return new Inventory();
	}

	@Bean
	public Product product() {
		return new Product();
	}

}
