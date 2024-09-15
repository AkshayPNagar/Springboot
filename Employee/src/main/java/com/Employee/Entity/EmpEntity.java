package com.Employee.Entity;

public class EmpEntity {

private int emp_id;
	
	private String emp_name;

	private String emp_department;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_department() {
		return emp_department;
	}

	public void setEmp_department(String emp_department) {
		this.emp_department = emp_department;
	}

	@Override
	public String toString() {
		return "EmpController [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_department=" + emp_department
				+ "]";
	}

	public EmpEntity( String emp_name, String emp_department) {
		super();
		
		this.emp_name = emp_name;
		this.emp_department = emp_department;
	}
	
	public EmpEntity( ) {
		super();
		
	}
}
