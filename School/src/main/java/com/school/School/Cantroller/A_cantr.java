package com.school.School.Cantroller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.School.Entity.Div_A;
import com.school.School.Service.A_ser;

@Component
@RestController
public class A_cantr {
	
	
	@Autowired
	A_ser as;

	@GetMapping("niraCityStudent")
	public ArrayList<Div_A> nirACityStudents()
	{
		ArrayList<Div_A> aa= as.f_infor();
		
		
		return aa;
		
	}

}
