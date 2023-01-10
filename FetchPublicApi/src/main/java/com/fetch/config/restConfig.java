package com.fetch.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class restConfig {
	
    
	@Bean
	public RestTemplate resttemplate(RestTemplateBuilder restbuilder) {
		RestTemplate restTemplate=restbuilder.build();
		return restTemplate;
	}

	
	
	
	
}
