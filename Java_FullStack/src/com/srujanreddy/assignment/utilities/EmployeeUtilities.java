package com.srujanreddy.assignment.utilities;
import com.srujanreddy.assignment.employees.Employee;

public class EmployeeUtilities {
	Employee emp = new Employee();
	
	public void updateSalary(Employee emp,double newSalary) {
		emp.setSalary(newSalary);
	}
	
	public void fetchSalary() {
		emp.getSalary();
	}
	
	public double fetchEmployeeId() {
        return emp.getemployeeId();
    }
	
	
}
