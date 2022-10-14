package com.yash.pmsapplication.service;

import java.util.List;

import com.yash.pmsapplication.exception.InvalidProject;
import com.yash.pmsapplication.model.Project;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author:ankesh.patil
 */
/*
 * Service abstract method
 */
public interface ServiceI {
	
	
	public void createProject(Project project);
	public void deleteById(int id);
    public List<Project> getall();
    public void update(Project project,int id) ;
    public Project getById(int id);
    public Project getByProjectName(String projectName);
}
