package com.yash.oas.restcontroller;

import java.util.List;

import com.yash.oas.entity.Trainer;
import com.yash.oas.serviceImpl.TrainerServiceImpl;
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
public class TrainerController {

	@Autowired
	TrainerServiceImpl trainerServiceImpl;

	@GetMapping("/trainer")
	public List<Trainer> getAllTrainer() {
		return trainerServiceImpl.getAllTrainer();
	}

	@GetMapping("/trainer/{name}")
	public Trainer getTrainerDetails(String name) {
		return trainerServiceImpl.getTrainerDetails(name);
	}

	@PostMapping("/trainer")
	public Trainer addNewTrainer(@RequestBody Trainer trainer) {
		return trainerServiceImpl.addNewTrainer(trainer);
	}

	@DeleteMapping("/trainer/{name}")
	public String deleteTrainer(@PathVariable String name) {
		return trainerServiceImpl.deleteTrainer(name);
	}
}
