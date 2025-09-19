package com.srujanreddy.assignment.employees;

public class Manager extends Employee {
		public int managerId ;
		protected double manSalary;
		private String email;
		
		public double getmanSalary() {
			return manSalary;
		}
		
		public void setmanSalary(double manSalary) {
			this.manSalary = manSalary;
		}
		
		public String getemail() {
			return email;
		}
		
		public void setemail(String number) {
			this.email = email;
		}
		
		
}
