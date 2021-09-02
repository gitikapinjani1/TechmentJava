package com.techment.Ques2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ClientBook {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Author1 author1=new Author1();
		Author1 author2=new Author1();
		
		author1.setName("Gitika");
		author2.setName("Sam");
		
		Book b1=new Book("Java",500,author1);
		Book b2 =new Book("Python",600,author1);
		Book b3 =new Book("Core Java",700,author2);
		Book b4 =new Book("cpp",800,author2);

		em.persist(author1);
		em.persist(author2);
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		em.persist(b4);
		
		List<Book> book1=new ArrayList<Book>();
		List<Book> book2=new ArrayList<Book>();
		book1.add(b1);
		book1.add(b2);
		book2.add(b3);
		book2.add(b4);
		
		author1.setBooks(book1);
		author2.setBooks(book2);
	
		em.getTransaction().commit();
	}

}
