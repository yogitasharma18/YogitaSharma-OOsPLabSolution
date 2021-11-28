package com.greatlearning.model;

public class Employee {
	private String firstName;
	private String lastName;
	private String deptName;
	
	//Constructor
	public Employee(String fName, String lName, String dept) {
		this.firstName = fName;
		this.lastName = lName;
		this.deptName = dept;
	}
	
	//getters method
	public String getFirstName() {
		return firstName;
		
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//setters method
	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
