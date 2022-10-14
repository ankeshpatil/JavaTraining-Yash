package com.yash.oas.repository;

import com.yash.oas.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ExamRepository extends JpaRepository<Exam, Integer> {

}
