package com.yash.oas.service;

import java.util.List;
import com.yash.oas.entity.User;

public interface UserService {

	public List<User> getAllUser();
	public User getUserDetails(String email);
	public User addNewUser(User user); 
}
