package com.project;

import java.util.Date;

/*
 * autor :ankesh.patil
 */
public class TestMain11 {

	/*
	 * 11)WAP to print the object of Employee class with the help of toString
	 * method. Employee class fields :- empid, empname, empsalary, empaddress,
	 * emp_dob, emp_doj. use Date class to store the date of birth(dob) and date of
	 * joining(doj).
	 */

public static void main(String[] args) {
		
		Employee employee=new Employee(101010, "Rahul", 1000.15,"Pune District", new Date(31/10/1994), new Date(27/07/2022));
		
		System.out.println(employee);
		
	}


}
