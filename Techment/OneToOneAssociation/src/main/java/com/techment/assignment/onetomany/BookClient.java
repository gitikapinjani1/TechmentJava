package com.techment.assignment.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BookClient {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		BookCategory categoryA=new BookCategory("Category A");
		
		List<Book> bookAs = new ArrayList<Book>();
        bookAs.add(new Book("Book A1", categoryA));
        bookAs.add(new Book("Book A2", categoryA));
        bookAs.add(new Book("Book A3", categoryA));
        em.persist(bookAs);
        
        categoryA.setBooks(bookAs);
        em.persist(categoryA);

        
        BookCategory categoryB = new BookCategory("Category B");
        List<Book> bookBs = new ArrayList<Book>();
        bookBs.add(new Book("Book B1", categoryB));
        bookBs.add(new Book("Book B2", categoryB));
        bookBs.add(new Book("Book B3", categoryB));
        em.persist(bookBs);
        
        categoryB.setBooks(bookBs);
        em.persist(categoryB);

	}

}
