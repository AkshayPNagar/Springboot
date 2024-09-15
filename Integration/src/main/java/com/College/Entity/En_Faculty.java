package com.College.Entity;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity

public class En_Faculty {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int faculty_id;
	
	String facultyName;
	String facultyCity;
	int facultySalary;
	int facultyExpYear;
	
	@ManyToMany
	List<Department> deptName;

	public En_Faculty(int faculty_id, String facultyName, String facultyCity, int facultySalary, int facultyExpYear,
			List<Department> deptName) {
		super();
		this.faculty_id = faculty_id;
		this.facultyName = facultyName;
		this.facultyCity = facultyCity;
		this.facultySalary = facultySalary;
		this.facultyExpYear = facultyExpYear;
		this.deptName = deptName;
	}

	public En_Faculty(String facultyName, String facultyCity, int facultySalary, int facultyExpYear,
			List<Department> deptName) {
		super();
		this.facultyName = facultyName;
		this.facultyCity = facultyCity;
		this.facultySalary = facultySalary;
		this.facultyExpYear = facultyExpYear;
		this.deptName = deptName;
	}

	public En_Faculty() {
		super();
	}

	public int getFaculty_id() {
		return faculty_id;
	}

	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getFacultyCity() {
		return facultyCity;
	}

	public void setFacultyCity(String facultyCity) {
		this.facultyCity = facultyCity;
	}

	public int getFacultySalary() {
		return facultySalary;
	}

	public void setFacultySalary(int facultySalary) {
		this.facultySalary = facultySalary;
	}

	public int getFacultyExpYear() {
		return facultyExpYear;
	}

	public void setFacultyExpYear(int facultyExpYear) {
		this.facultyExpYear = facultyExpYear;
	}

	public List<Department> getDeptName() {
		return deptName;
	}

	public void setDeptName(List<Department> deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "En_Faculty [faculty_id=" + faculty_id + ", facultyName=" + facultyName + ", facultyCity=" + facultyCity
				+ ", facultySalary=" + facultySalary + ", facultyExpYear=" + facultyExpYear + ", deptName=" + deptName
				+ "]";
	}
	
	
	
	

}
