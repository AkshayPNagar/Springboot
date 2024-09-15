package com.school.School.Dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.school.School.Entity.Div_A;

@Repository

public class A_Dao {

 public ArrayList<Div_A> info()
	{
	 
	 	ArrayList<Div_A> A = new ArrayList<>();
	 	
	 	A.add(new Div_A(1, "Akshay","Nira"));	
	 	A.add(new Div_A(2, "Sahas","Nira"));	
	 	A.add(new Div_A(3, "Himanshu","Sangali"));	
	 	A.add(new Div_A(4, "Adi","Pune"));	
	 	A.add(new Div_A(5, "Krishna","Dharashiv"));	
	 	
	 	
	 return A;
	}

}
