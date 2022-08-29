
/**
 * @author ankesh.patil
 *
 */
package com.project;

import java.util.Date;

/*
 * WAP to print the object of Employee class with the help of toString method. 
   Employee class fields :- empid, empname, empsalary, empaddress, emp_dob, 
    emp_doj. use Date class to store the date of birth(dob) and date of joining(doj).
 */
public class Employee {
	


	long empid;
	String empname;
	double empsalary;
	String empaddress;
	Date emp_dob;
    Date emp_doj;
    
    
	public Employee(long empid, String empname, double empsalary, String empaddress, Date emp_dob, Date emp_doj) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empaddress = empaddress;
		this.emp_dob = emp_dob;
		this.emp_doj = emp_doj;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empaddress="
				+ empaddress + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
	}
	
	
    
    
	
	
	
	
	

}
