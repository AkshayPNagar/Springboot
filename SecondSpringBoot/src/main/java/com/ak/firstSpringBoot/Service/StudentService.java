package com.ak.firstSpringBoot.Service;

import java.util.ArrayList;

import com.ak.firstSpringBoot.Dao.studentDao;
import com.ak.firstSpringBoot.entity.Student;
public class StudentService {
	
	
	studentDao dao = new studentDao();
	
	
	public ArrayList<Student> allStudentName()
	{
	ArrayList<Student> al = dao.info();
	
	ArrayList<Student> alFiltered = new ArrayList<Student>();
			
	
	for(Student infooo : al)
	{
		if(!infooo.getName().equals("Shinde"))
		{
			alFiltered.add(infooo);
		}
		
	}
			

	return alFiltered;
			}
}

