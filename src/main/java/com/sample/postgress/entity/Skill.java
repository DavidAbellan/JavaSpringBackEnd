package com.sample.postgress.entity;



import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;




@Entity
@Table (name="skill")
public class Skill  {
	
	@Id
	@Column (name= "id")
	private String id;
	
	@Column (name = "name")
	private String name;
	@Column (name = "description")
	private String description;
	
	@ManyToMany(fetch = FetchType.LAZY,mappedBy ="skillemployee")
	Set <Employee>employees;
	
	@ManyToMany (mappedBy = "projectskill")
	Set<Project>projectskill;
	
	
	public void setEmployee(Employee employee) {
		this.employees.add(employee);
		
	}
	
	
	@JsonIgnore
	@JsonProperty(value="employees")
	public Set<Employee> getEmployee() {
		return employees;
	}
	public void setEmployees(Set<Employee> employee) {
		this.employees = employee;
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


	
	
	
}