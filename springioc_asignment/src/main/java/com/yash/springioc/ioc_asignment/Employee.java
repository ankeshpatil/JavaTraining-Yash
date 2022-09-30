package com.yash.springioc.ioc_asignment;
/**
 * 
 * @author ankesh.patil
 *
 */
public class Employee {
	 String empId;//Y001
	 String empName; //Yash
	 String empRole;//Trainee
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + "]";
	}
	 
	 
}
