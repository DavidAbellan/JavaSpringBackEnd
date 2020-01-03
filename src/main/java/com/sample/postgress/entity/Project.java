package com.sample.postgress.entity;


import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Project  {
	
	@Id
	@Column (name= "id")
	private String id;
	
	@Column (name = "name")
	private String name;
	@Column (name = "description")
	private String description;
	@Column (name = "startdate")
	private String startDate;
	@Column (name = "enddate")
	private String endDate;
	
	@ManyToMany(mappedBy="projectsEmployees")
	Set<Employee>employees;
	
	public String getId() {
		return id;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	public void setEmployee(Employee employee) {
		this.employees.add(employee);
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
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	

	
}