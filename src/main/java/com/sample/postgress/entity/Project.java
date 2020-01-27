package com.sample.postgress.entity;


import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="project")

public class Project  {
	
	@Id
	@Column (name= "id")
	private String id;
	@Column (name = "name")
	private String name;
	@Column (name = "description")
	private String description;
	@Column (name = "startdate")
	private LocalDate startDate;
	@Column (name = "enddate")
	private LocalDate endDate;
	
	
	@OneToMany(targetEntity = EmployeeProjectPeriod.class,cascade = CascadeType.ALL)
	@JoinColumn(name="idproject")
	Set<EmployeeProjectPeriod> projectsEmployees;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable (
			name = "projectskill",
			joinColumns = @JoinColumn(name ="projectid"),
			inverseJoinColumns = @JoinColumn (name="skillid")
			)
	     Set<Skill> projectskill;
	
	
	
	
    public Set<Skill> getProjectskill() {
		return projectskill;
	}
	public Set<EmployeeProjectPeriod> getProjectsEmployees() {
		return projectsEmployees;
	}
	public void setProjectsEmployees(Set<EmployeeProjectPeriod> projectsEmployees) {
		this.projectsEmployees = projectsEmployees;
	}
	public void setProjectskill(Set<Skill> projectskill) {
		this.projectskill = projectskill;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate localDate) {
		this.startDate = localDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	

	
}