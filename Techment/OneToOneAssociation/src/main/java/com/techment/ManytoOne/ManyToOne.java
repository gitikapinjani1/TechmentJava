package com.techment.ManytoOne;

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
		
		Owner owner=new Owner();
		
		Vehicle vehicle1=new Vehicle();
		Vehicle vehicle2=new Vehicle();
		
		owner.setOwnerId(1);
		owner.setOwnerName("Gitika");
		em.persist(owner);
		
		vehicle1.setVId(101);
		vehicle1.setVName("BMW");
		vehicle1.setOwner(owner);
		em.persist(vehicle1);
		
		vehicle2.setVId(201);
		vehicle2.setVName("Audi");
		vehicle2.setOwner(owner);
		em.persist(vehicle2);
		
		System.out.println("=========inserted=============");
		
		em.getTransaction().commit();
		
	}

}
