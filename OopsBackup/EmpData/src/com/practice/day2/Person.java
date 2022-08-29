/**
 * 
 */
package com.practice.day2;

/**
 * @author ankesh.patil
 *
 */
public class Person {

	/**
	 * @) Create a class Person with following member and setter getter for them.
	 *    Pid, pname, paddress,dob all are private. Now Person class will be inherit
	 *    by the Employee class will have following fields salary, date_of_joining,
	 *    base_location, deptobj, contactno, emailid. Department class will have
	 *    following member, deptid, and dname. Customer class also inherit the
	 *    Person class, it also has following fields: - date_of_registration,
	 *    delivery_address, contactno, email_id. Setter and getter methods for all
	 *    class variables should be declared. Now you have to create object of
	 *    Employee class and Customer class. With the help of super keyword
	 *    initialize the person class data members as they are protected. Create
	 *    array of object of department class and while creating the object of the
	 *    Employee class we will pass object of that particular department. Now
	 *    print all details of the Customer and Employee.
	 */

	private String pid;
	private String pname;
	private String paddress;
	private String dob;

	Person(){
		
	}
	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + ", dob=" + dob + "]";
	}

	public Person(String pid, String pname, String paddress, String dob) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.paddress = paddress;
		this.dob = dob;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
