package com.cg.dao;
import javax.persistence.EntityManager;

import com.cg.entity.Student;

public class StudentDaolmpl implements StudentDao {
	
	private EntityManager entityManager;
	
	public StudentDaolmpl()
	{
		setEntityManager(JPAUtil.getEntityManager());
	}

	
	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beingTransaction() {
		// TODO Auto-generated method stub
		
	}


	public EntityManager getEntityManager() {
		return entityManager;
	}


	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}

//