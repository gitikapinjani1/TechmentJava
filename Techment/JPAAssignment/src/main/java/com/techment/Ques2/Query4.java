package com.techment.Ques2;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Query4 {

	public static void main(String[] args) {
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		Query query3=em.createQuery("select a.name from Author1 a ,Book b where b.ISBN=1 AND b.author=a.id");	
	
		
		Object ob=query3.getResultList( );
		
		Iterator iterator=((List) ob).iterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next());
			System.out.println("==================================");
		}
		
		
	}

}
