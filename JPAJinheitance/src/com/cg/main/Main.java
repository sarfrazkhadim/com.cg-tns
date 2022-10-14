package com.cg.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpaj.entities.Employee;

public class Main
{
   public static void main(String arg[])
   {
   EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
   EntityManager em= factory.createEntityManager();
   em.getTransaction().begin();
   Employee employee=new Employee();
   employee.setName("sarfraj"); 
   employee.setSalary(5000); 
   em.persist(employee); 
   
   
   System.out.println("sucessfully added one employee and manager in database");
   em.getTransaction().commit();
   em.close();
   factory.close();
  
  
   }
   
}
