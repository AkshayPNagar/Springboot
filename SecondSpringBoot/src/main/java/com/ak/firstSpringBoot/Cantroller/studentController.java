package com.ak.firstSpringBoot.Cantroller;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ak.firstSpringBoot.entity.Student;
import com.ak.firstSpringBoot.Service.StudentService;

@RestController
public class studentController {
	
	StudentService ss = new StudentService();
//	@GetMapping("firstSpringboot")
//	
//	public String welcomeMsg()
//	{
//		return "First SpringBoot Project Ran Succesfully";
//	}
//	
//	@GetMapping("StudentDetails")
//	
//	public ArrayList<Student> info()
//	{
//		ArrayList<Student> al = new ArrayList();
//		
//		al.add(new Student(1,"Akshay"));
//		al.add(new Student(2, "Sahas"));
//		al.add(new Student(3, "Himanshu"));
//		al.add(new Student(4, "Shinde"));
//		al.add(new Student(5, "Nagar"));
//		
//		
//		
//		return al;
//	}

	@GetMapping("studentsName")
	public ArrayList<Student> allStudentNames()
	{
		ArrayList<Student> students =ss.allStudentName();
		return students;
	}

}
