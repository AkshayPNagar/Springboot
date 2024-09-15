package com.ak.firstSpringBoot.Dao;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ak.firstSpringBoot.entity.Student;

public class studentDao {
	
	
	
	public ArrayList<Student> info()
	{
		ArrayList<Student> al = new ArrayList();
		
		al.add(new Student(1,"Akshay"));
		al.add(new Student(2, "Sahas"));
		al.add(new Student(3, "Himanshu"));
		al.add(new Student(4, "Shinde"));
		al.add(new Student(5, "Nagar"));
		
		
		
		return al;
	}
	

}
