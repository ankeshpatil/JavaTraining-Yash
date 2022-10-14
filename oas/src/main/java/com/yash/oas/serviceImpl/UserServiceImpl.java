package com.yash.oas.serviceImpl;

import java.util.List;
import com.yash.oas.entity.User;
import com.yash.oas.repository.UserRepository;
import com.yash.oas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	

	@Override
	public List<User> getAllUser() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User getUserDetails(String email) {
		
		return userRepository.findByEmail(email);
	}

	@Override
	public User addNewUser(User user) {
		return this.userRepository.save(user);
	}
	

}
