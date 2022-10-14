package com.yash.oas.service;

import java.util.List;

import com.yash.oas.entity.Exam;





public interface ExamService {
	
	public List<Exam> getAllExam();
	public Exam getParticularExam( int id);
	public Exam addNewExam(Exam exam );
	public void deleteExam( int id);
}
