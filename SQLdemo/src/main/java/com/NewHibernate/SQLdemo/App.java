package com.NewHibernate.SQLdemo;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


//native queries
public class App 
{
    public static void main( String[] args )
    {
    	
    	
		Configuration cf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Apple.class);
		SessionFactory sf=cf.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx =session.beginTransaction();
		
		Random r = new Random();
		for(int i=0;i<20;i++)
		{
			Apple app=new Apple();
	    	app.setId(i);
	    	app.setName("kashmiri "+i);
	    	app.setPrice(r.nextInt(1000));
	    	
	    	session.save(app);
		}
	
		
		 SQLQuery q = session.createSQLQuery("select * from apple where price>65");
		 
		 q.addEntity(Apple.class);
		 List<Apple> ap = q.list();
		 
		 for(Apple o:ap)
		 {
			 System.out.println(o);
		 }
		 
		 SQLQuery query = session.createSQLQuery("select name,price from apple where price > 60");
	    	query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
	    	List apple = query.list();
	    	for (Object object : apple) {
				Map m = (Map) object;
	    		System.out.println(m.get("name") + " : " + m.get("price"));
			}
		 
		 
		tx.commit();
    }
}
