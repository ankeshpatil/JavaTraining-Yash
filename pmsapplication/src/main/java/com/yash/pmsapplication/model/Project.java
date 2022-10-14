package com.yash.pmsapplication.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author:ankesh.patil
 */
/*
 * Project Model Class
 */

@Entity
@Table(name = "project")
public class Project {
	/*
	 * Id of project
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	/*
	 * project name
	 */
	private String projectName;
	/*
	 * project unique Identity code
	 */
	private String projectIdentifier;
	/*
	 * project Description
	 */
	private String description;
	/*
	 * Date of creation of project
	 */
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date created_At;
	/*
	 * Date of project update
	 */
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date updated_At;
	/*
	 * expected end date of project
	 */
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date end_date;
	/*
	 * Start Date of project
	 */
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date start_date;

	/*
	 * Getter & Setter methods
	 */

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * @return the projectIdentifier
	 */
	public String getProjectIdentifier() {
		return projectIdentifier;
	}

	/**
	 * @param projectIdentifier the projectIdentifier to set
	 */
	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the created_At
	 */
	public Date getCreated_At() {
		return created_At;
	}

	/**
	 * @param created_At the created_At to set
	 */
	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}

	/**
	 * @return the updated_At
	 */
	public Date getUpdated_At() {
		return updated_At;
	}

	/**
	 * @param updated_At the updated_At to set
	 */
	public void setUpdated_At(Date updated_At) {
		this.updated_At = updated_At;
	}

	/**
	 * @return the end_date
	 */
	public Date getEnd_date() {
		return end_date;
	}

	/**
	 * @param end_date the end_date to set
	 */
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	/**
	 * @return the start_date
	 */
	public Date getStart_date() {
		return start_date;
	}

	/**
	 * @param start_date the start_date to set
	 */
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	

	/**
	 * @PrePersist annotation will execute before object will be saved in db
	 */
	@PrePersist
	public void createdOn() {
		this.created_At = new Date();
	}

	/**
	 * @PostUpdate annotation will execute after update. These annotations will run
	 *             as life cycle
	 */
	@PreUpdate
	@PostUpdate
	public void updatedOn() {
		this.created_At = new Date();
	}

}
