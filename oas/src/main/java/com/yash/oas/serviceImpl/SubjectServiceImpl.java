package com.yash.oas.serviceImpl;

import java.util.List;
import com.yash.oas.entity.Subject;
import com.yash.oas.repository.SubjectRepository;
import com.yash.oas.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService{
	@Autowired
	SubjectRepository subjectRepository; 

	@Override
	public List<Subject> getAllSubjects() {
		return (List<Subject>) subjectRepository.findAll();

	}

	@Override
	public Subject addNewSubject(Subject subject) {
		return subjectRepository.save(subject);
	}

	@Override
	public String deleteSubject(String name) {
		 int row =subjectRepository.deleteByName(name);
		    return row + " row get deleted";  
	}
	

}
