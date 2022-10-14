package com.yash.oas.serviceImpl;

import java.util.List;
import com.yash.oas.entity.Result;
import com.yash.oas.repository.ResultRepository;
import com.yash.oas.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultServiceImpl implements ResultService {

	@Autowired
	ResultRepository resultRepository;

	@Override
	public List<Result> getAllResult() {
		return (List<Result>) resultRepository.findAll();
	}

	@Override
	public Result addNewResult(Result result) {
		return resultRepository.save(result);
	}

	@Override
	public List<Result> getAllResultForStudent(String email) {
		return resultRepository.findByEmailEmail(email);
	}

}
