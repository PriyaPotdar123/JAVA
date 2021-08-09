package com.NewHibernate.Connetionhibe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*
 * @entity will define our class as entity 
 * @id is to denote primary key
 * @manytoone here many students can have one teacher
 * @onetomany here one student can use many laptops
 * @column(name=" ") can define/change column name
 * @table(name="   ") can define/change table name
 * @embadable will define that class as an component to another class where we can use
 * primary key of that class and no need to create another table for it
 * 
 */

public class Mainapp {

	public static void main(String[] args) {
		
		Laptops lap=new Laptops();
		lap.setId(1);
		lap.setName("lenovoideapad");
		
		Laptops lap2=new Laptops();
		lap2.setId(2);
		lap2.setName("lenovoThinkpad");
		
		Laptops lap3=new Laptops();
		lap3.setId(3);
		lap3.setName("dell");
		
		Laptops lap4=new Laptops();
		lap4.setId(4);
		lap4.setName("Hp");
		
		Fullname Tname=new Fullname();
		Tname.setFname("omkar");
		Tname.setMname("rajendra");
		Tname.setLname("nanavre");
		
		Fullname Tname1=new Fullname();
		Tname1.setFname("ketan");
		Tname1.setMname("rajendra");
		Tname1.setLname("kolte");
		
		Fullname fname=new Fullname();
		fname.setFname("Priya");
		fname.setMname("Anantkumar");
		fname.setLname("Potdar");
		
		
		Fullname Mname=new Fullname();
		Mname.setFname("Tushar");
		Mname.setMname("Anantkumar");
		Mname.setLname("Potdar");
		
		Student stud1=new Student();
		stud1.setRollno(1);
		stud1.setAge(21);
		stud1.setName(Mname);
		stud1.getLapi().add(lap);
		stud1.getLapi().add(lap2);
		
		Student stud2=new Student();
		stud2.setRollno(2);
		stud2.setAge(21);
		stud2.setName(fname);
		stud2.getLapi().add(lap3);
		stud2.getLapi().add(lap4);
		
		Teacher ts=new Teacher();
		ts.setTid(101);
		ts.setAddress("pune");
		ts.getStd().add(stud2);
		ts.setName(Tname);

		Teacher ts1=new Teacher();
		ts1.setTid(102);
		ts1.setAddress("mumbai");
		ts1.getStd().add(stud1);
		ts1.setName(Tname1);

		Configuration cf = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).addAnnotatedClass(Laptops.class).addAnnotatedClass(Teacher.class);
		
		SessionFactory sf=cf.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		
		session.save(lap);
		session.save(lap2);
		session.save(lap3);
		session.save(lap4);
		session.save(stud1);
		session.save(stud2);
		session.save(ts);
		session.save(ts1);
		tx.commit();
	}

}
