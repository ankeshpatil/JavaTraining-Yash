package com.yash.oas.repository;

import com.yash.oas.entity.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
	public Admin findByName(String name);
	
}
