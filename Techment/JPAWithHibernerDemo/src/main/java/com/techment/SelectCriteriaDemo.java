package com.techment;
  
import javax.persistence.*;  
import javax.persistence.criteria.*;
import javax.persistence.criteria.CriteriaQuery;
  
import java.util.*;  
public class SelectCriteriaDemo {  
      
      
    public static void main( String args[]) {  
             
           
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");  
          EntityManager em = emf.createEntityManager();  
          em.getTransaction().begin( );  
          CriteriaBuilder cb=em.getCriteriaBuilder();  
          
          CriteriaQuery<Student> cq=cb.createQuery(Student.class);  
            
         Root<Student> stud=cq.from(Student.class);  

         cq.multiselect(stud.get("s_name"));   
           
          CriteriaQuery<Student> select = cq.select(stud);  
          TypedQuery<Student> q = em.createQuery(select);  
          List<Student> list = q.getResultList();  
  
          System.out.println("s_id");  
               
            
          for(Student s:list)  
          {  
          System.out.print(s.getS_id());
          System.out.println(" "+s.getS_name());
      
        }  
            
em.getTransaction().commit();  
          em.close();  
          emf.close();    
     }  
}  