package com.yash.oas.restcontroller;

import java.util.List;
import com.yash.oas.entity.Subject;
import com.yash.oas.serviceImpl.SubjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("http://localhost:3000")
@RestController
public class SubjectController {
	
	@Autowired
	private SubjectServiceImpl subjectServiceImpl;

	// to get all subject
	@GetMapping("/subject")
	public List<Subject> getAllSubjects() {
		return subjectServiceImpl.getAllSubjects();
	}

	// to add a new subject
	@PostMapping("/subject")
	public Subject addNewSubject(@RequestBody Subject subject) {
		return subjectServiceImpl.addNewSubject(subject);
	}

	// to delete a subject
	@DeleteMapping("/subject/{name}")
	public String deleteSubject(@PathVariable("name") String name) {
		return subjectServiceImpl.deleteSubject(name);
	}

}
