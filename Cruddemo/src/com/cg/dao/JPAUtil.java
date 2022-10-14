package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil 
{
  public static EntityManagerFactory factory;
  public static EntityManager entityManager;
  
  static 
  {
	  factory=Persistence.createEntityManagerFactory ("JPA-PU");
  }
  
  
  public static EntityManager getEntityManager()
  {
	  if(entityManager == null |entityManager.isOpen())
	  {
		  entityManager=factory.createEntityManager();
		  
	  }
	return entityManager;
	  
  }
}
