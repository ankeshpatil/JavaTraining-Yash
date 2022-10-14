package com.yash.pmsapplication.controller;

import java.util.List;

import com.yash.pmsapplication.exception.InvalidProject;
import com.yash.pmsapplication.model.Project;
import com.yash.pmsapplication.serviceImpl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:ankesh.patil
 */
/*
 * Project Controller class
 */
@RestController

public class ProjectController {

	@Autowired
	ServiceImpl serviceImpl;

	@PostMapping("/add")
	public void createProject(@RequestBody Project project) {
		serviceImpl.createProject(project);

	}

	@DeleteMapping("/delete/{id}")

	public void delete(@PathVariable int id) {
		serviceImpl.deleteById(id);
	}

	@GetMapping("/getall")
	public List<Project> getAll() {
		return serviceImpl.getall();
	}

	@GetMapping("/getbyid/{id}")
	public Project getById(@PathVariable int id) {
		return serviceImpl.getById(id);

	}

	@GetMapping("/getbyName/{projectName}")
	public Project getByname(@PathVariable String projectName) {
		return serviceImpl.getByProjectName(projectName);

	}

	@PostMapping("/update/{id}")
	public void update(@RequestBody Project project, @PathVariable int id) {
		serviceImpl.update(project, id);

	}
}
