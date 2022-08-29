package com.practice.day2;

import java.util.logging.Logger;

public class Customer {

	//logger
    static Logger logger = Logger.getLogger(Customer.class.getName());
	
	public Customer() {

	}
	

	private String date_of_registration;
	private String delivery_address;
	private String contactno;
	private String email_id;

	public String getDate_of_registration() {
		return date_of_registration;
	}

	public void setDate_of_registration(String date_of_registration) {
		this.date_of_registration = date_of_registration;
	}

	public String getDelivery_address() {
		return delivery_address;
	}

	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	@Override
	public String toString() {
		return "Customer [date_of_registration=" + date_of_registration + ", delivery_address=" + delivery_address
				+ ", contactno=" + contactno + ", email_id=" + email_id + "]";
	}

	public static void main(String[] args) {
		
		Department[] deptob = new Department[1];
		deptob[0] = new Department("101", "Development");

		Employee emp = new Employee();
		emp.setBase_location("Hinjewadi");
		emp.setContactno("7242472487");
		emp.setDeptobj(deptob);
		emp.setDate_of_joining("24 june");
		emp.setEmailid("csjjsh@com");
		emp.setSalary("20000");

		Customer cust = new Customer();
		cust.contactno = "7499470156";
		cust.date_of_registration = "24 aug";
		cust.delivery_address = "YASH Magarpatta";
		cust.email_id = "yash@com";

	//emp.getEmpData();
	
		logger.info(emp.toString());
		
		logger.info(cust.toString());

	}

}
