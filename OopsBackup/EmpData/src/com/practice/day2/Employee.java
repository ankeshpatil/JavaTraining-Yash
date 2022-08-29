package com.practice.day2;

public class Employee extends Person {
	private String salary;
	private String date_of_joining;
	private String base_location;
	private Department[] deptobj;
	private String contactno;
	private String emailid;
	
	

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDate_of_joining() {
		return date_of_joining;
	}

	public void setDate_of_joining(String date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	public String getBase_location() {
		return base_location;
	}

	public void setBase_location(String base_location) {
		this.base_location = base_location;
	}

	public Department[] getDeptobj() {
		return deptobj;
	}

	public void setDeptobj(Department[] deptob) {
		this.deptobj = deptob;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
		
	}
	public void useSuper() {
		super.setPid("1015943");
		super.setPname("Ankesh Patil");
		super.setPaddress("Hijewadi");
		super.setDob("31 march");
	}
	
	public void getEmpData() {
		System.out.println("Employee Information"+"\n"+"EmailID :"+emailid+"\n"+"ContactNo : "+contactno+"\n"+"Date of Joining : "+date_of_joining+"\n"+"Base Location"+base_location+"\n"+"Salary : "+salary+"\n"+"Department : "+deptobj);
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", date_of_joining=" + date_of_joining + ", base_location="
				+ base_location + ", contactno=" + contactno + ", emailid=" + emailid + "]";
	}
	
	
	

}
