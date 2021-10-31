package com.deepika.demo.model;

public class Employee {
	
	private String name;
	private String designation;
	private String Salary;
	 
	public Employee(String name, String designation, String salary) {
		
		this.name = name;
		this.designation = designation;
		Salary = salary;
	}
	 	
	public String getName() {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}	
}
