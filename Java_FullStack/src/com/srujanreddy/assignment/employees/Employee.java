package com.srujanreddy.assignment.employees;

public class Employee {
	public String name = "srujan";
	protected int employeeId = 7439;
	private double  salary = 100000;
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getemployeeId() {
		return employeeId;
	}
	
	public void setemployeeId(int  employeeId) {
		this.employeeId = employeeId;
	}
	
}
