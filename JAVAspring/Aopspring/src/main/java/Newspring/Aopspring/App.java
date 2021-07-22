package Newspring.Aopspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
     Delivary d = context.getBean(Delivary.class);
     d.dispatched();
     d.packagedelivary();
    }
}
