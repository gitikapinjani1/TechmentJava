package com.techment.onetomanyDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyClient {

	public static void main(String[] args) {


		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Employee1 e1=new Employee1("Sam", "Developer");
		Employee1 e2=new Employee1("Lisa", "HR");
		Employee1 e3=new Employee1("Emmy", "Manager");
		
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		
		List<Employee1> employee =new ArrayList<Employee1>();
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		
		Depertment d1=new Depertment();
		
		d1.setName("HR");
		d1.setEmployees(employee);
		
		em.persist(d1);
		
		em.getTransaction().commit();
		
	}

}
