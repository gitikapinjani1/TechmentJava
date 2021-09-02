package com.techment.onetomany;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ManyToOne {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Course java =new Course(90,"java",4);
		Course python =new Course(91,"python",4);
		Course cpp =new Course(92,"c++",4);
		
		List<Course> course=new ArrayList<Course>();
		course.add(java);
		course.add(python);
		course.add(cpp);
		
		em.persist(java);
		em.persist(python);
		em.persist(cpp);
		
		Student sam=new Student();
		sam.setId(1);
		sam.setName("Sam");
		sam.setCourse(course);
		
		em.persist(sam);
		
		System.out.println("===========inserted==========");
		
		em.getTransaction().commit();
		
		
	}

}
