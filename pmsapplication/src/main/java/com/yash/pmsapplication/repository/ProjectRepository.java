package com.yash.pmsapplication.repository;

import com.yash.pmsapplication.model.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author:ankesh.patil
 */
/**
 * Project Repository
 */

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{

	//Project findByIdProjectName(String projectName);

	Project findByProjectName(String projectName);
	

}
