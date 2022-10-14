package com.yash.oas.service;

import java.util.List;

import com.yash.oas.entity.Result;

public interface ResultService {
	
	 public List<Result> getAllResult();
	 public  Result addNewResult( Result result);
	 public List<Result> getAllResultForStudent( String email);

}
