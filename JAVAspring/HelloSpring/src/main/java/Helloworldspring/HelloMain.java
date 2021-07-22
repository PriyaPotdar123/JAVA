package Helloworldspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		 
		 HelloSpring obj = (HelloSpring) context.getBean("HelloSpring");
		 
	      obj.getMessage();
	}

}
