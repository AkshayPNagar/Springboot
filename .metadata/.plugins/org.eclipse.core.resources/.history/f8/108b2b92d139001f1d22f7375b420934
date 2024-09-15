package com.ak.firstSpringBoot;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {
	
	@GetMapping("firstSpringboot")
	
	public String welcomeMsg()
	{
		return "First SpringBoot Project Ran Succesfully";
	}
	
	@GetMapping("StudentDetails")
	
	public ArrayList<Student> info()
	{
		ArrayList<Student> al = new ArrayList();
		
		al.add(new Student(1,"Akshay"));
		al.add(new Student(2, "Sahas"));
		
		
		
		return al;
	}
	

}
