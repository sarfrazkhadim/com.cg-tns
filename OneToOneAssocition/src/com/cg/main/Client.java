package com.cg.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entities.Address;
import com.cg.entities.Student;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Student student = new Student();
		student.setName("sarfraz ");
		Address homeAddress = new Address();
		homeAddress.setStreet("la Road");
		homeAddress.setCity("latur");
		homeAddress.setState("Maharashtra");
		homeAddress.setZipCode("411 457");
		
		//inject address into student
		student.setAddress(homeAddress);
		
		//persist only student, no need to persist Address explicitly
		em.persist(student);
		em.getTransaction().commit();
		
		System.out.println("Added one student with address to database.");
		em.close();
		factory.close();
	}
}
