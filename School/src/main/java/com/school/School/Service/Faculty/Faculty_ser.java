package com.school.School.Service.Faculty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.School.Dao.Faculty.Teaching_Faculty_Dao;
import com.school.School.Entity.Faculty.Subjects;
import com.school.School.Entity.Faculty.Teaching_Faculty;

@Service
public class Faculty_ser {

	@Autowired
	Teaching_Faculty_Dao td;

	public List<String> allSubjects() {
		ArrayList<String> sub = new ArrayList<>();
		ArrayList<Teaching_Faculty> allSubjects = td.facultySubjects();

		for (Teaching_Faculty tf : allSubjects) {
			List<Subjects> subList = tf.getSubNames();
			for (Subjects subjects : subList) {
				sub.add(subjects.getSubName());
			}
		}

		return sub;
	}

	public HashMap<String, Integer> Faculty_Experience()

	{
		// ArrayList<Teaching_Faculty> exp = new ArrayList<>();
		ArrayList<Teaching_Faculty> all_faculty = td.facultySubjects();
		HashMap<String, Integer> name_exp = new HashMap<>();

		for (Teaching_Faculty tf : all_faculty) {

			if (tf.getFacultyExpYear() > 1/* Year */) {
				name_exp.put(tf.getFacultyName(), tf.getFacultyExpYear());
			}
		}

		return name_exp;

	}

	public String max_exper_Name() {
		ArrayList<Teaching_Faculty> all_faculty = td.facultySubjects();

		Teaching_Faculty max_Faculty = null;

		for (Teaching_Faculty tf : all_faculty) {

			if (max_Faculty == null || tf.getFacultyExpYear() > max_Faculty.getFacultyExpYear()) {
				max_Faculty = tf;

			}

		}
		return max_Faculty.getFacultyName() + " has maximum experience";

	}

	List<Subjects> subForFaculty() {
	
		return null;
	}

	String facNameFromID() {
		return null;
	}

}
