package com.NewHibernate.ObjLifeinHibernate;

import java.util.List;
import java.util.Random;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//object life cycle in hibernate 
//transient : we create object using new and it is in transient state
//persistent : we can say that an object is in the persistence state when we save or persist it
//detached :close the session then the object entered into the detached state. 
//modifications in the data don't affect any changes in the database.




public class App 
{
    public static void main( String[] args )
    {
    	
		Configuration cf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		SessionFactory sf=cf.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx =session.beginTransaction();
		
		Student stud = new Student();
		 stud.setId(4);
		 stud.setName("priya");
		 stud.setMarks(65);
		 
		 session.save(stud);
		 
		 stud.setMarks(88);
		
		session.getTransaction().commit();
		
		session.detach(stud);
		stud.setMarks(870);
    }
}
