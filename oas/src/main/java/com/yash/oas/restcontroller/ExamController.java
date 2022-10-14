package com.yash.oas.restcontroller;

import java.util.List;
import com.yash.oas.entity.Exam;
import com.yash.oas.serviceImpl.ExamServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("http://localhost:3000")
public class ExamController {

	@Autowired
	private ExamServiceImpl examServiceImpl;

	// to get all exam
	@GetMapping("/exam")
	public List<Exam> getAllExam() {
		return examServiceImpl.getAllExam();
	}

	// to get details of a particular exam
	@GetMapping("/exam/{id}")
	public Exam getParticularExam(@PathVariable("id") int id) {
		return examServiceImpl.getParticularExam(id);
	}

	// to add a new exam
	@PostMapping("/exam")
	public Exam addNewExam(@RequestBody Exam exam) {
		return examServiceImpl.addNewExam(exam);
	}
	
	@DeleteMapping("/exam/{id}")
	public void deleteExam(@PathVariable int id)
	{
		 examServiceImpl.deleteExam(id);
	}
}
