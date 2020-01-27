package com.sample.postgress.entity;



import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Absence  {
	
	@Id
	@Column (name= "id")
	private String id;
	@Column (name= "employeeid")
	private String employeeid;
	@Column (name = "type")
	private String type;
	@Column (name = "description")
	private String description;
	@Column (name = "startdate")
	private LocalDate startDate;
	@Column (name = "enddate")
	private LocalDate endDate;
	
	@ManyToOne
	@JoinColumn(name="employeeid",insertable = false, updatable = false)
    Employee employee;	
	
	
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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