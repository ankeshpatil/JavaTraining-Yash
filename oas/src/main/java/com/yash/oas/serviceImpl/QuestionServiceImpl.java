package com.yash.oas.serviceImpl;

import java.util.List;
import com.yash.oas.entity.Question;
import com.yash.oas.repository.QuestionRepository;
import com.yash.oas.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionRepository questionRepository;

	@Override
	public List<Question> getAllQuestion() {
		// TODO Auto-generated method stub
		return (List<Question>) questionRepository.findAll();
	}

	@Override
	public Question addNewQuestion(Question question) {
		// TODO Auto-generated method stub
		return questionRepository.save(question);
	}

	@Override
	public List<Question> getAllQuestionForExam(int id) {
		// TODO Auto-generated method stub
		return questionRepository.findByEnameId(id);
	}

	@Override
	public Question updateQuestion(int id, Question question) {
		// TODO Auto-generated method stub
		question.setId(id);
		return questionRepository.save(question);
	}

	@Override
	public void deleteQuestion(int id) {
		// TODO Auto-generated method stub
		questionRepository.deleteById(id);

	}

}
