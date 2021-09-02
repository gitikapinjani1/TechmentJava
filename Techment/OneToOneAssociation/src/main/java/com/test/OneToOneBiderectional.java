package com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneBiderectional {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Library library=new Library();
		library.setName("Central Library");
		em.persist(library);
		
		Book1 bk1=new Book1();
		bk1.setBookName("java");
		bk1.setAuthor("lenda");
		bk1.setLibrary(library);
		
		em.persist(bk1);
		
		Book1 bk2=new Book1();
		bk2.setBookName("python");
		bk2.setAuthor("abc");
		bk2.setLibrary(library);
		
		em.persist(bk2);
		
		em.getTransaction().commit();
		
		
	}

}
