package com.yash.oas.restcontroller;

import java.util.List;
import com.yash.oas.entity.User;
import com.yash.oas.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("http://localhost:3000")
@RestController
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;

	// get all user
	@GetMapping("/user")
	public List<User> getAllUser() {
		return userServiceImpl.getAllUser();
	}

	// get user detail by its email
	@GetMapping("/user/{email}")
	public User getUserDetails(@PathVariable("email") String email) {
		return userServiceImpl.getUserDetails(email);
	}

	// to add a new user
	@PostMapping("/user")
	public User addNewUser(@RequestBody User user) {
		return userServiceImpl.addNewUser(user);
	}

}
