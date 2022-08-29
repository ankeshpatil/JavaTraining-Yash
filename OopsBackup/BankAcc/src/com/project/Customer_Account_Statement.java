package com.project;

import java.util.logging.Logger;

/*
 * author: ankesh.patil
 */
public class Customer_Account_Statement extends Customer {
	/*
	 * account details
	 */
	private String caID;
	private String custId;
	private String amount;
	private String deposit_withdrawl;
	private String deposit_date;
	private Branch branch_obj;



	
	// Logger

	static Logger logger = Logger.getLogger(Customer_Account_Statement.class.getName());
	/*
	 * constructor
	 */
	public Customer_Account_Statement(String custId, String accountno, String custname, String cust_address,
			String cust_dob, String cust_account_opening_date, String caID, String custId2, String amount,
			String deposit_withdrawl, String deposit_date, Branch branch_obj) {
		super(custId, accountno, custname, cust_address, cust_dob, cust_account_opening_date);
		this.caID = caID;
		custId = custId2;
		this.amount = amount;
		this.deposit_withdrawl = deposit_withdrawl;
		this.deposit_date = deposit_date;
		this.branch_obj = branch_obj;
	}

	@Override
	public String toString() {
		return "Customer_Account_Statement [caID=" + caID + ", custId=" + custId + ", amount=" + amount
				+ ", deposit_withdrawl=" + deposit_withdrawl + ", deposit_date=" + deposit_date + ", branch="
				+ branch_obj + "]";
	}

	public String getCaID() {
		return caID;
	}

	public void setCaID(String caID) {
		this.caID = caID;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDeposit_withdrawl() {
		return deposit_withdrawl;
	}

	public void setDeposit_withdrawl(String deposit_withdrawl) {
		this.deposit_withdrawl = deposit_withdrawl;
	}

	public String getDeposit_date() {
		return deposit_date;
	}

	public void setDeposit_date(String deposit_date) {
		this.deposit_date = deposit_date;
	}

	public Branch getBranch_obj() {
		return branch_obj;
	}

	public void setBranch_obj(Branch branch_obj) {
		this.branch_obj = branch_obj;
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		Customer_Account_Statement.logger = logger;
	}
	
	

}
