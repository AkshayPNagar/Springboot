package com.SpringMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cantroller {
	
	@GetMapping("/getProduct/{pname}")
	public String getProduct(@PathVariable String pname)
	{
		return pname;
	}
	

}
