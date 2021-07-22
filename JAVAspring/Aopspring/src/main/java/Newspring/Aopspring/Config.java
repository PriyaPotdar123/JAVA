package Newspring.Aopspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("Newspring.Aopspring")
public class Config {
	@Autowired
	Delivary d;
	
	@Bean
	public void show()
	{
		d.setId(1);
		d.setName("Pratik");
		d.setNumber("9823457391");
		d.setAddress("pune");
	}

}
