package com.techment.Ques2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Query1 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		Query query2 = em.createQuery( "select b from Book b"); 
		
		@SuppressWarnings("unchecked")
		List<Book> list=(List<Book>)query2.getResultList( );
		
		for(Book b:list)
		{
			System.out.print(b.getTitle());
			System.out.println("==================================");
		}
	}

}
