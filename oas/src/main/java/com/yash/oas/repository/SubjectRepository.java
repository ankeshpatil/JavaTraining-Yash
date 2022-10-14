package com.yash.oas.repository;

import com.yash.oas.entity.Subject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface SubjectRepository extends JpaRepository<Subject,String> {
	@Transactional
	public int deleteByName(String name);

}
