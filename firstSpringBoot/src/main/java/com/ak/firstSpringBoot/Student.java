package com.ak.firstSpringBoot;

public class Student {
	
	int Roll_no;
	String name;
	public int getRoll_no() {
		return Roll_no;
	}
	public void setRoll_no(int roll_no) {
		Roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int roll_no, String name) {
		super();
		Roll_no = roll_no;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [Roll_no=" + Roll_no + ", name=" + name + "]";
	}
	

}
