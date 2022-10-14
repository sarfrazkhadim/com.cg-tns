package com.cg.service;

import com.cg.dao.StudentDao;
import com.cg.dao.StudentDaolmpl;
import com.cg.entity.Student;

public class StudentServicelmpl implements StudentService 
{
     @SuppressWarnings("unused")
	private StudentDao dao;
     public StudentServicelmpl() {
    	 dao =new StudentDaolmpl();
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
	public void findStudentById(int id) {
		// TODO Auto-generated method stub
		
	}

}
