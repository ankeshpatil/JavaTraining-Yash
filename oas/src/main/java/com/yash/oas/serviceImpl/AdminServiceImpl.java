package com.yash.oas.serviceImpl;

import com.yash.oas.entity.Admin;
import com.yash.oas.repository.AdminRepository;
import com.yash.oas.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminRepository adminRepository;

	@Override
	public Admin getAdminDetails(String name) {
		return this.adminRepository.findByName(name);
	}

	@Override
	public String registerAdmin(Admin admin) {
		adminRepository.save(admin);
		return "Register successful";

	}

}
