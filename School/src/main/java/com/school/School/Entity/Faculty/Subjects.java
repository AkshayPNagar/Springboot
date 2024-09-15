package com.school.School.Entity.Faculty;

public class Subjects {
	
	int subId;
	
	String subName;

	@Override
	public String toString() {
		return "Subjects [subId=" + subId + ", subName=" + subName + "]";
	}

	public Subjects() {
		super();
	}

	public Subjects(int subId, String subName) {
		super();
		this.subId = subId;
		this.subName = subName;
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}
}
