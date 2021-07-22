package Newspring.Aopspring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class Helper {
	
	@Before("execution(public void packagedelivary())")
	public void transaction()
	{
		System.out.println("Transaction has completed sucessfully");
	}
	
	@After("execution(public void packagedelivary())")
	public void endtransaction()
	{
		System.out.println("Your package is deliverd");
	}

}
