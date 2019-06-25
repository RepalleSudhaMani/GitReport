package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class SwimConfig {
	@Bean
	public FortuneService myFortuneService()
	{
		return new SadFortuneService();
	}
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(myFortuneService());
	}
}
