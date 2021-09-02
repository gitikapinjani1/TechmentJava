package com.techment.Ques2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Iterator;

public class Query2 {

	public static void main(String[] args) {

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		Query query3=em.createQuery("select b.title from Book b,Author1 a where b.author=a.id AND a.name='Gitika'");	
	
		
		Object ob=query3.getResultList( );
		
		Iterator iterator=((List) ob).iterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next());
			System.out.println("==================================");
		}
		
		
		
		
		
	}

}
