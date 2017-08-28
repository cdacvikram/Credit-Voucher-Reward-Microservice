package com.service.reward;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ApplicationConfig configures the rest template
 * 
 * @author Vikram
 */
@Configuration
public class ApplicationConfig {
	
	/**
	 * RestTemplate bean
	 * @return restTemplate
	 */
	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
}
