package com.sample.postgress.entity;


import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;



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
	private String startDate;
	
	@Column (name = "enddate")
	private String endDate;
	
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	@ManyToOne
	@JoinColumn(name="employeeid",insertable = false, updatable = false)
    Employee employee;	
	
	
	
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