package com.techment;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class RetriveDemo {

	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query<Student> query=session.createQuery("select s.studentId,s.name from student s");
		List<Student> st=query.list();
		Object obj=query.list();
		System.out.println(obj.toString());
		
		session.close();
		sessionFactory.close();
	}
}