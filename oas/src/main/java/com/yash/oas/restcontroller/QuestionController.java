package com.yash.oas.restcontroller;

import java.util.List;
import com.yash.oas.entity.Question;
import com.yash.oas.serviceImpl.QuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("http://localhost:3000")
@RestController
public class QuestionController {

	@Autowired
	private QuestionServiceImpl questionServiceImpl;

	// to show all question present in database
	@GetMapping("/question")
	public List<Question> getAllQuestion() {
		return questionServiceImpl.getAllQuestion();
	}

	// add a question in a particular exam
	@PostMapping("/question")
	public Question addNewQuestion(@RequestBody Question question) {
		return questionServiceImpl.addNewQuestion(question);
	}

	// to get details of all question of that particular exam (ofcourse using
	// exam_id)
	@GetMapping("/exam/{id}/question")
	public List<Question> getAllQuestionForExam(@PathVariable("id") int id) {
		return questionServiceImpl.getAllQuestionForExam(id);
	}

	// edit a question in a particular exam
	@PutMapping("/question/{id}")
	public Question updateQuestion(@PathVariable("id") int id, @RequestBody Question question) {

		return questionServiceImpl.updateQuestion(id, question);
	}

	// delete a question in a particular exam
	@DeleteMapping("/question/{id}")
	public void deleteQuestion(@PathVariable("id") int id) {
		questionServiceImpl.deleteQuestion(id);
	}

}
