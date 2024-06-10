package com.result.project.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Configurationmad {

	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}
	
	
}
