package com.school.School.Entity;


public class Div_A {
	
	
	int Roll_No;
	String Name;
	
	public Div_A() {
		super();
	}
	@Override
	public String toString() {
		return "DIV_A [Roll_No=" + Roll_No + ", Name=" + Name + ", City=" + City + "]";
	}
	public Div_A(int roll_No, String name, String city) {
		super();
		Roll_No = roll_No;
		Name = name;
		City = city;
	}
	String City;
	public int getRoll_No() {
		return Roll_No;
	}
	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	

}
