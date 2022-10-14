package com.yash.pmsapplication.serviceImpl;

import java.lang.annotation.Annotation;
import java.util.List;

import com.yash.pmsapplication.exception.InvalidProject;
import com.yash.pmsapplication.model.Project;
import com.yash.pmsapplication.repository.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yash.pmsapplication.service.ServiceI;

/**
 * @author:ankesh.patil
 */
/*
 * Service Implementation
 */
@Service
public class ServiceImpl implements ServiceI {
	Project project = new Project();
	@Autowired

	ProjectRepository projectRepository;

	@Override
	public void createProject(Project project) {
		// TODO Auto-generated method stub
		projectRepository.save(project);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

		projectRepository.deleteById(id);
	}

	@Override
	public List<Project> getall() {
		return projectRepository.findAll();
	}

	@Override
	public void update(Project project,int id)  {
	project.setId(id);
	projectRepository.save(project);
			
	}

	
	@Override
	 public Project getById(int id) {
		return projectRepository.findById(id).orElse(null);
		
	}
	
	@Override
	 public Project getByProjectName(String projectName) {
		 return projectRepository.findByProjectName(projectName);
	 }
	}

