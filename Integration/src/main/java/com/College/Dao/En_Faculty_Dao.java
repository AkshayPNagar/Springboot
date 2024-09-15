package com.College.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.College.Entity.Department;
import com.College.Entity.En_Faculty;


@Repository
public class En_Faculty_Dao {
	
	En_Faculty ef;
	
	Department dpart;
		 
		 public List<En_Faculty> information() {
		        Department dep1 = new Department("Computer", "A", "Vina_Lomate");
		        Department dep2 = new Department("IT", "A", "Saurabh_Prahad");
		        Department dep3 = new Department("ENTC", "A", "XYZ");
		        Department dep4 = new Department("Mechanical", "A", "ABC");

		        List<Department> departments1 = List.of(dep1);
		        List<Department> departments2 = List.of(dep2);
		        List<Department> departments3 = List.of(dep3);
		        List<Department> departments4 = List.of(dep4);

		        En_Faculty ef1 = new En_Faculty("Shrutika_Nalawade", "Pandharpur", 50000, 6, departments1);
		        En_Faculty ef2 = new En_Faculty("Shaifali_Gupta", "Pune", 50000, 6, departments2);
		        En_Faculty ef3 = new En_Faculty("Hema_Kumbhar", "Pune", 50000, 6, departments3);
		        En_Faculty ef4 = new En_Faculty("Madhuri_Patil", "Kolhapur", 50000, 6, departments4);

		        return List.of(ef1, ef2, ef3, ef4);
		    }
	 }

