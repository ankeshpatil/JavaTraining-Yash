package com.yash.oas.restcontroller;

import com.yash.oas.entity.Admin;
import com.yash.oas.serviceImpl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class AdminController {
	
	@Autowired
	private AdminServiceImpl adminServiceImpl;

	@GetMapping("/admin/{name}")
	public Admin getAdminDetails(@PathVariable("name") String name) {
		return adminServiceImpl.getAdminDetails(name);
	}

	@PostMapping("/addadmin")
	public String registerAdmin(@RequestBody Admin admin) {
		return adminServiceImpl.registerAdmin(admin);

	}

}
