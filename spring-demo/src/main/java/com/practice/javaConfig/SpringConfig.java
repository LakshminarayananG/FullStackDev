package com.practice.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	public Customer customer() {
		return new Customer();
	}

	@Bean
	public Account account() {
		return new Account();
	}

}
