package com.College.Entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Component
	
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int deptID;
	String deptName;
	String deptDivision;
	String deptHodName;
	
	public Department(String deptName, String deptDivision, String deptHodName) {
		super();
		this.deptName = deptName;
		this.deptDivision = deptDivision;
		this.deptHodName = deptHodName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	

}
