package com.techment.Ques1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Client {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Author author = new Author();
		
		author.setAuthorId(10);
		author.setFirstName("gitika");
		author.setMiddleName(" ");
		author.setLastName("harris");
		author.setPhoneNo(98989898);
		
		em.persist(author);
		
		Query query = em.createQuery( "Select s from Author s");  
        
        @SuppressWarnings("unchecked")  
		List<Author> list=(List<Author>)query.getResultList( );  
         
        System.out.print("s_id");  
        System.out.print("\t \t s_name");  
       System.out.println("\t \t  s_phoneNumber");  
          
          
        for( Author s:list ){  
           System.out.print( s.getAuthorId());  
           System.out.print("\t" +  s.getFirstName());  
          System.out.print(" " + s.getMiddleName());
          System.out.print(" "+s.getLastName());
          System.out.print("\t"+s.getPhoneNo());
          System.out.println();  
          
        }  
        
        Query query2 = em.createQuery( "update Author SET middleName='kuch bhi' where firstName='gitika'");  
        query2.executeUpdate(); 
        
        for( Author s:list ){  
            System.out.print( s.getAuthorId());  
            System.out.print("\t" +  s.getFirstName());  
           System.out.print(" " + s.getMiddleName());
           System.out.print(" "+s.getLastName());
           System.out.print("\t"+s.getPhoneNo());
           System.out.println();  
         }  
        
        Query query3 = em.createQuery("delete from Author where AuthorId=8");  
        query3.executeUpdate();  
        
        for( Author s:list ){  
            System.out.print( s.getAuthorId());  
            System.out.print("\t" +  s.getFirstName());  
           System.out.print(" " + s.getMiddleName());
           System.out.print(" "+s.getLastName());
           System.out.print("\t"+s.getPhoneNo());
           System.out.println();  
         }  
        
        Author author2=em.find(Author.class, 1);
        System.out.println(author2.getAuthorId());
        System.out.println(author2.getFirstName());
        System.out.println(author2.getPhoneNo());
        
        em.getTransaction().commit();
		
		
	}

}
