package com.school.School.Entity.Faculty;

import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class Teaching_Faculty {

	int facultyId;
	String facultyName;
	int facultyExpYear;
	
	List<Subjects> subNames;

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public int getFacultyExpYear() {
		return facultyExpYear;
	}

	public void setFacultyExpYear(int facultyExpYear) {
		this.facultyExpYear = facultyExpYear;
	}

	public List<Subjects> getSubNames() {
		return subNames;
	}

	public void setSubNames(List<Subjects> subNames) {
		this.subNames = subNames;
	}

	@Override
	public String toString() {
		return "Teaching_Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", facultyExpYear="
				+ facultyExpYear + ", subNames=" + subNames + "]";
	}

	public Teaching_Faculty(int facultyId, String facultyName, int facultyExpYear, List<Subjects> subNames) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.facultyExpYear = facultyExpYear;
		this.subNames = subNames;
	}

	public Teaching_Faculty() {
		super();
	}
	
	
}
