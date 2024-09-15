package com.College.Cantroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.College.Service.En_Faculty_Ser;

@RestController
@Component
public class En_Faculty_Cant {
	
	@Autowired
	En_Faculty_Ser efs;
	
	@GetMapping("allDepartNames")
	public List<String> departmentNames()
	{
		List<String> list = efs.departmentNames();
		return list;
	}
	
	@GetMapping("/getProduct/{pname}")
	public String getProduct(@PathVariable String pname)
	{
		return pname;
	}
	

	
	
	

}
