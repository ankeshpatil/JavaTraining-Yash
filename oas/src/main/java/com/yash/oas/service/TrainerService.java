package com.yash.oas.service;

import java.util.List;

import com.yash.oas.entity.Trainer;



public interface TrainerService {
	
	public List<Trainer> getAllTrainer();
	public Trainer getTrainerDetails(String name);
	public Trainer addNewTrainer(Trainer trainer); 
	public String deleteTrainer(String name);

}
