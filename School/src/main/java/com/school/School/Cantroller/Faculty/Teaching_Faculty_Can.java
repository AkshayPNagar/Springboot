package com.school.School.Cantroller.Faculty;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.School.Service.Faculty.Faculty_ser;
@Component
@RestController
public class Teaching_Faculty_Can {
	
	@Autowired
	Faculty_ser fs;
	
	@GetMapping("facultySubjects")
	List<String> facultySubjects ()
	{
		List<String> sub =fs.allSubjects();
		return sub;
	}
	
	@GetMapping("Faculty_Experience")
	HashMap<String, Integer> Faculty_Experience()
	
	{
		
		return fs.Faculty_Experience();
	
	}
	
	@GetMapping("max_exper_Name")
	public String max_exper_Name()
	{
			
			return fs.max_exper_Name();
	}
	
	@GetMapping("facNameFromID")
	String facNameFromID()
	{
		return null;
	}

		
}
