package com.project;
import java.util.logging.Logger;

import com.project.*;

/**
 * @author ankesh.patil
 *
 */
public class Test {

	/**
	 * @ Create Class Customer which will have following class members: - CustId,
	 * accountno, custname, cust_address, cust_dob, cust_account_opening_date,
	 * Branch_Obj. Class Branch :- branch_id, branch_name, branch_address. Class
	 * Customer_Account_Statement:- CAID, CustId, amount, deposit_withdrawl,
	 * deposit_date. Now you have to create Customer, Branch and
	 * CustomerAccountStatement class object. CustomerAccountStatement will have
	 * multiple records as one customer will deposit and withdrawal the amount. So
	 * you need to print the statement as per the CustomerId. What is expected:- you
	 * will create multiple object of customer class. Also you have to create
	 * multiple object of the CustomerAccountStatement and while printing detail of
	 * CustomerAccountStatement you have to print detail of Customer.
	 */
	static Logger logger = Logger.getLogger(Test.class.getName());
	
	public static void main(String[] args) {
	Branch br1=new Branch("3035", "IOB", "Nigdi");
	Customer_Account_Statement name = new Customer_Account_Statement("101", " IOB38756383978", "Ankesh Patil ", "Malkapur,Buldhana ", "22-aug-1999 ", " 3-march-2020", "47480 ", "101 ", "52000 ", "7000 ", "25-aug-2022 ", br1);
    //System.out.println(name);
    logger.info(" "+name);
    
	
	}

}
