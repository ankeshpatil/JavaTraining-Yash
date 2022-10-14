package com.yash.oas.service;
import com.yash.oas.entity.Admin;


public interface AdminService {
	
	public Admin getAdminDetails(String name);
	public String registerAdmin(Admin admin);
}
