package com.yash.collection.task9;

/**
 * @author ankesh.patil
 */
/*
 * You have to create your own hashing function to store the detail of different 
employees on the basis of their employee id. Now when a new employee object is 
about to add into list you have to follow following rule. 
class Employee
{
 int empid
 String empname;
 int salary;
 String deptname;
 String address;
}
Above image illustrate storing the employee details for remainder up to 5 but the 
same method can be used to store the other employee details with remainder 6,7,8,9 
should be store respectively.
 */
import java.util.concurrent.CopyOnWriteArrayList;

public class TestMain9 {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Employee> empList = new CopyOnWriteArrayList<>();
		Employee employee1 = new Employee(101, "ketan", 1000, "dev", "pune");
		Employee employee2 = new Employee(103, "rahul", 2000, "dev", "nagpur");
		Employee employee3 = new Employee(102, "amol", 4000, "dev", "mumbai");

		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		for (Employee employee : empList) {
			int objectElement = employee.getEid();
			int index = objectElement % 10;
			empList.add(index, employee);
		}
		empList.forEach(System.out::println);
	}
}
