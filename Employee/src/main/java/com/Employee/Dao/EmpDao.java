package com.Employee.Dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.Employee.Entity.EmpEntity;

@Component
public class EmpDao {
	
	public ArrayList<EmpEntity> info()
	{
		ArrayList<EmpEntity> al = new ArrayList();
		al.add(new EmpEntity("Akshay", "Backend"));
		al.add(new EmpEntity("Adi", "Backend"));
		al.add(new EmpEntity("Sahas", "Backend"));
		al.add(new EmpEntity("Sahas", "FrontENd"));
		al.add(new EmpEntity("Krishna", "HR"));
		al.add(new EmpEntity("Himanshu", "Testing"));
		return al;
	}

}
