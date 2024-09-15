package com.Employee.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Employee.Dao.EmpDao;
import com.Employee.Entity.EmpEntity;


@Component
public class EmpService {
	@Autowired
	EmpDao ed;
	
	public ArrayList<EmpEntity> employee()
	{
		ArrayList<EmpEntity> al =ed.info(); // ed is object
		
		ArrayList<EmpEntity> filtered = new ArrayList<>();
		
		for(EmpEntity filter : al)
		{
			if(filter.getEmp_department().equals("Backend"))
			{
				filtered.add(filter);
			}
		}
		
		return filtered;
	}
	
	

}
