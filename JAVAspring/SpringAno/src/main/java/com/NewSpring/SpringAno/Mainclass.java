package com.NewSpring.SpringAno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//spring core annotations
public class Mainclass {

	public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(Configclass.class);
	Nokiya mobile = (Nokiya)context.getBean(Nokiya.class);
	mobile.phone();
	}

}
