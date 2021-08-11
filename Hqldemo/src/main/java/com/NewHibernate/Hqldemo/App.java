package com.NewHibernate.Hqldemo;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App 
{
    public static void main( String[] args )
    {
    	
		Configuration cf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		SessionFactory sf=cf.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx =session.beginTransaction();
		
//		Random r=new Random();
//    	for(int i=1;i<=50;i++)
//    	{
//    		Student stud = new Student();
//    		stud.setId(i);
//    		stud.setName("persone"+i);
//    		stud.setMarks(r.nextInt(70));
//    		session.save(stud);
//    	}
    	int b=60;
    	// SELECT * FROM STUDENT
		Query q = session.createQuery("from Student where marks>63");
		List<Student> student = q.list();
		for(Student s: student)
		{
			System.out.println(s.getId()+"  "+s.getName()+"  "+s.getMarks());
		}
		
		//SELECT * FROM STUDENT WHERE ID=1;
		Query q1 =session.createQuery("from Student where id=10");
		Student s = (Student) q1.uniqueResult();
		System.out.println(s.getId()+"  "+s.getName()+"  "+s.getMarks());
		
		
		Query q2 = session.createQuery("from Student where id=5");
		Object s1= (Student) q2.uniqueResult();
		System.out.println(((Student) s1).getId()+"  "+((Student) s1).getName()+"  "+((Student) s1).getMarks());
		
		
		Query q3 = session.createQuery("select sum(marks) from Student");
		Object s2=q3.uniqueResult();
		System.out.println(s2);
		
		Query q4 = session.createQuery("select max(marks) from Student");
		Object s3=q4.uniqueResult();
		System.out.println(s3);
		
		Query q5 = session.createQuery("select sum(marks) from Student s where s.marks>:b");
		q5.setParameter("b", b);
		Object s4=q5.uniqueResult();
		System.out.println(s4);
		
		tx.commit();
    }
}
