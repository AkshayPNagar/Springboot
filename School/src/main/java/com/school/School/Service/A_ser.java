package com.school.School.Service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.School.Dao.A_Dao;
import com.school.School.Entity.Div_A;

@Service
public class A_ser {
	
	@Autowired
	A_Dao ad;
	
	public ArrayList<Div_A> f_infor ()
	{
		ArrayList<Div_A> info = ad.info();
		ArrayList<Div_A> f_info = new ArrayList<>();
		
		for(Div_A info_temp : info)
		{
			if(info_temp.getCity().equals("Nira"))
			{
				f_info.add(info_temp);
			}
		}
		
		
		return f_info;
	}
	
	

}
