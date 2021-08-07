package com.practice.javaConfigOtherTry;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Stock stock() {
		return new Stock();
	}

}
