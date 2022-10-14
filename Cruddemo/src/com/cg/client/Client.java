package com.cg.client;
import com.cg.entity.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServicelmpl;

public class Client
{
  public static void main (String[] arg)
  {
	  StudentService service = new StudentServicelmpl();
	  Student student =new Student();
	  student.setStudentId(22);
	  student.setName("Sarfraj Khadim");
	  service.addStudent(student);
	  
	 
	  
	  System.out.println("End of program");
	  
  }
}
