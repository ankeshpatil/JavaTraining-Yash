package com.yash.oas.repository;

import com.yash.oas.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
	public User findByEmail(String email);
}
