package com.srujanreddy.assignment;
import com.srujanreddy.assignment.employees.*;
import com.srujanreddy.assignment.utilities.*;

public class AssignmentMain {
	
	public static void main (String [] args) {
		EmployeeUtilities emputil = new EmployeeUtilities();
		
	}
	
	Developer dev = new Developer();
	Manager man  = new Manager();
	
	emputil.updateSalary(dev ,10000);	

}
