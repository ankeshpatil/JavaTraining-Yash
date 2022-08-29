/**
 * Department info
 */
package com.practice.day2;

/**
 * @author ankesh.patil
 *
 */
public class Department {

	String deptid;
	String dname;
	
	
	public Department(String deptid, String dname) {
		super();
		this.deptid = deptid;
		this.dname = dname;
	}

	public String getDeptid() {
		return deptid;
	}
	
	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}
	
	public String getDname() {
		return dname;
	}
	
	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", dname=" + dname + "]";
	}
	
	
	
}
