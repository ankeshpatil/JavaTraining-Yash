package com.yash.oas.repository;

import java.util.List;
import com.yash.oas.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

	public List<Question> findByEnameId(int id);
}