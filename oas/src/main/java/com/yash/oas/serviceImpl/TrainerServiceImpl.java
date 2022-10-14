package com.yash.oas.serviceImpl;

import java.util.List;

import com.yash.oas.entity.Trainer;
import com.yash.oas.repository.TrainerRepository;
import com.yash.oas.service.TrainerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerServiceImpl implements TrainerService {

	@Autowired
	TrainerRepository trainerRepository;

	@Override
	public List<Trainer> getAllTrainer() {
		return (List<Trainer>) trainerRepository.findAll();
	}

	@Override
	public Trainer getTrainerDetails(String name) {
		return trainerRepository.findByName(name);
	}

	@Override
	public Trainer addNewTrainer(Trainer trainer) {
		return trainerRepository.save(trainer);
	}

	@Override
	public String deleteTrainer(String name) {
		 int row =trainerRepository.deleteByName(name);
		    return row + " row get deleted"; 
		

	}

}
