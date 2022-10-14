package com.yash.oas.service;

import java.util.List;

import com.yash.oas.entity.Question;


public interface QuestionService {

	public List<Question> getAllQuestion();

	public Question addNewQuestion(Question question);

	public List<Question> getAllQuestionForExam(int id);

	public Question updateQuestion(int id, Question question);

	public void deleteQuestion(int id);
}
