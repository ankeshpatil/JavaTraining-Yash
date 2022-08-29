package com.project;

import java.util.logging.Logger;



/*
 * author: ankesh.patil
 */
public class Branch  {
	/*
	 * Branch Details
	 */
	private String branch_id;
	private String branch_name;
	private String branch_address;
	
	/*
	 * constructor
	 */
	public Branch(String branch_id, String branch_name, String branch_address) {
		super();
		this.branch_id = branch_id;
		this.branch_name = branch_name;
		this.branch_address = branch_address;
	}
	
	static Logger logger = Logger.getLogger(Branch.class.getName());

	public String getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getBranch_address() {
		return branch_address;
	}
	public void setBranch_address(String branch_address) {
		this.branch_address = branch_address;
	}
	
	
	@Override
	public String toString() {
		return "Branch [branch_id=" + branch_id + ", branch_name=" + branch_name + ", branch_address=" + branch_address
				+ "]";
	}
	
	public void getBranch() {
		
		logger.info("Branch Name : "+ branch_name+"\n"+"Branch Id : "+branch_id+"\n"+"Branch Address"+branch_address);
		
	}
	
	
	
	

}
