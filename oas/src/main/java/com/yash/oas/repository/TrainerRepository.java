package com.yash.oas.repository;

import com.yash.oas.entity.Trainer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface TrainerRepository extends JpaRepository <Trainer,Integer>{

	public Trainer findByName(String name);
	@Transactional
	public int deleteByName(String name);

}
