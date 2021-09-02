package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneClient {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Address address =new Address();
		address.setDoorNo(1001);
		address.setCity("Raipur");
		address.setStreetName("kT");
		
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("Gitika");
		employee.setDesignation("Developer");
		employee.setAddress(address);
		
		em.persist(address);
		em.persist(employee);
		
		em.getTransaction().commit();
		
		
	}

}
