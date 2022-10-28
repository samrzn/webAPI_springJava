package com.exemploAPI.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.exemploAPI.service.DatabaseService;

@Configuration
@Profile("dev")
public class TesteConfig {

	@Autowired
	private DatabaseService service;

	@Bean
	public void start() {
		service.startDatabase();
	}

}
