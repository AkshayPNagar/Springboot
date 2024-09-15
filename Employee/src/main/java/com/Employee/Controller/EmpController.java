package com.Employee.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Service.EmpService;
import com.Employee.Entity.EmpEntity;
import com.Employee.Entity.Product;

@RestController
@Component
public class EmpController {
	@Autowired
	EmpService es ;
	
	
	@GetMapping("Emp")
	
	public ArrayList<EmpEntity> info()
	{
		ArrayList<EmpEntity> backend = es.employee();
		return backend;
	}
	
	@GetMapping("/getProduct/{pname}")
	public String getProduct(@PathVariable String pname)
	{
		return pname;
	}
	
	@DeleteMapping("/deleteProduct/{pname}")
	public String deleteProduct(@PathVariable String pname)
	{
		return "deleted product - "+pname;
	}
	
	@PostMapping("/postProduct/{prodct}")
	public Product postProduct(@RequestBody Product prodct)
	{
		System.out.println(prodct);
		return prodct;
	}
	

	
}
