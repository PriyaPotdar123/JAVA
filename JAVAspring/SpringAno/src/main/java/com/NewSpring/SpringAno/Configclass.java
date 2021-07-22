package com.NewSpring.SpringAno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.NewSpring.SpringAno")
public class Configclass 
{
//	@Bean
//	public Nokiya sendphone()
//	{
//		return new Nokiya();
//	}
	@Bean
	public Snapdragon snapdragon()
	{
		return new Snapdragon();
	}
}
