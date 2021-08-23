package com.log.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Logcontrollar {
	Logger log =LoggerFactory.getLogger(Logcontrollar.class);
	
	
	@RequestMapping("home")
	public String home()
	{
		log.error("error happened");
		return "hello home";
	}
	
	@RequestMapping("trace")
	public String trace()
	{
		log.trace("tracing");
		return "hello trace";
	}
	
	@RequestMapping("del")
	public String delete()
	{
		return "hello delete";
	}
	
	@RequestMapping("debug")
	public String debug()
	{
		log.debug("debuging");
		return "hello debug";
	}
}
