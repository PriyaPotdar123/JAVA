package com.NewHibernate.FirstandSecondlevelcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App 
{
	public static void main(String[] args) {
		
		Employee ep1;
		
		Configuration cgf = new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sf=cgf.buildSessionFactory();
		
		Session sess =sf.openSession();
		Transaction tx=sess.beginTransaction();
		ep1= (Employee) sess.get(Employee.class, 1);
		System.out.println(ep1.getId());
		tx.commit();
		
		Session sess1 =sf.openSession();
		Transaction tx1=sess1.beginTransaction();
		ep1= (Employee) sess1.get(Employee.class, 1);
		System.out.println(ep1.getId());
		tx1.commit();
	}
    
}
