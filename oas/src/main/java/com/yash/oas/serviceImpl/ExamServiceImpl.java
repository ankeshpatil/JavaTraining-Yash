package com.yash.oas.serviceImpl;

import java.util.List;
import java.util.Optional;
import com.yash.oas.entity.Exam;
import com.yash.oas.repository.ExamRepository;
import com.yash.oas.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ExamServiceImpl implements ExamService {

	@Autowired
	ExamRepository examRepository;
	
	@Override
	public List<Exam> getAllExam() {
		return (List<Exam>)examRepository.findAll();
	}

	@Override
	public Exam getParticularExam(int id) {
		Optional<Exam> optional =  this.examRepository.findById(id);
		return optional.get();
	}

	@Override
	public Exam addNewExam(Exam exam) {
		return examRepository.save(exam);
	}
    @Override
	public void deleteExam(int id) {
    	
    	 examRepository.deleteById(id);
		
	}
	
}
