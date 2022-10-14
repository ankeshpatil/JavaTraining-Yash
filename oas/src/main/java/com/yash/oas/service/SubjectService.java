package com.yash.oas.service;

import java.util.List;
import com.yash.oas.entity.Subject;


public interface SubjectService {

	public List<Subject> getAllSubjects();
	public Subject addNewSubject(Subject subject);
	public String deleteSubject( String name);
}
