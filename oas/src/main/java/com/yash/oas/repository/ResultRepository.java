package com.yash.oas.repository;

import java.util.List;

import com.yash.oas.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends JpaRepository<Result, Integer> {
	public List<Result> findByEmailEmail(String email);

}
