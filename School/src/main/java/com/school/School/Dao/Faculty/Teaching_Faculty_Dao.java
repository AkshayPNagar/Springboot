package com.school.School.Dao.Faculty;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.school.School.Entity.Faculty.Subjects;
import com.school.School.Entity.Faculty.Teaching_Faculty;

@Repository
public class Teaching_Faculty_Dao {

	public ArrayList<Teaching_Faculty> facultySubjects ()
	{
		ArrayList<Teaching_Faculty> faculty = new ArrayList<>();
		ArrayList<Subjects> sub = new ArrayList<>();
		sub.add(new Subjects(1,"Marathi"));
		sub.add(new Subjects(2,"English"));
		sub.add(new Subjects(3,"Hindi"));
		
		Teaching_Faculty tf = new Teaching_Faculty(101, "Akshay", 5, sub);
		
		ArrayList<Subjects> sub2 = new ArrayList<>();
		sub2.add(new Subjects(4,"JAVA"));
		sub2.add(new Subjects(5,"HIBERNATE"));
		sub2.add(new Subjects(6,"SPRINGBOOT"));
		
		Teaching_Faculty tf2 = new Teaching_Faculty(102, "Sahas", 3, sub2);
		

		ArrayList<Subjects> sub3 = new ArrayList<>();
		sub3.add(new Subjects(7,"HTML"));
		sub3.add(new Subjects(8,"CSS"));
		sub3.add(new Subjects(9,"JS"));
		
		Teaching_Faculty tf3 = new Teaching_Faculty(103, "HImanshu", 1, sub3);
		
		

		ArrayList<Subjects> sub4 = new ArrayList<>();
		sub4.add(new Subjects(10,"JAVA"));
		sub4.add(new Subjects(11,"HIBERNATE"));
		sub4.add(new Subjects(12,"SPRINGBOOT"));
		
		Teaching_Faculty tf4 = new Teaching_Faculty(104, "ADi", 2, sub4);
		
		faculty.add(tf);
		faculty.add(tf2);
		faculty.add(tf3);
		faculty.add(tf4);
		return faculty;
	
	
	}

	String mostExperienceFaculty()
	
		{
		
		return null;
	
		}
		
	String facNameFromID()
		{
		return null;
		}
	 	}
