package com.NewSpring.SpringAno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Nokiya 
{
	@Autowired
	@Qualifier("snapdragon")
	Processor cpu;
	public void phone()
	{
		System.out.println("Welcome to Nokiya Family");
		System.out.println("This Smartphone has Advanced features");
		cpu.setprocessor();
	}

}
