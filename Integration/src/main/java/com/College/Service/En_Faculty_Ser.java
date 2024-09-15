package com.College.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.College.Dao.En_Faculty_Dao;
import com.College.Entity.Department;
import com.College.Entity.En_Faculty;

@Service
public class En_Faculty_Ser{
	
	@Autowired
	En_Faculty_Dao efDao;
	
	@Autowired
	Department dept;
	
	public List<String> departmentNames()
	{
		
		ArrayList <String> department = new ArrayList<>();
		List<En_Faculty> al = efDao.information();
		
		for(En_Faculty ef: al)
		{
			List<Department> dept = ef.getDeptName();
			for(Department depart : dept)
			{
				department.add(depart.getDeptName());
			}
		}
		
		return department;
	}
	
	

	
}
