package com.sample.postgress.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="employeeprojectperiod")
public class EmployeeProjectPeriod {
	@Id
	@Column (name= "id")
	private String id;
	@Column (name= "employeeid")
	private String idEmployee;
	@Column (name= "idproject")
	private String idProject;
	@Column (name = "startdate")
	private LocalDate startDate;
	@Column (name = "enddate")
	private LocalDate endDate;
	@Column (name = "dedication")
	private String dedication;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="employeeid",insertable = false, updatable = false)
    Employee employee;
	
	@ManyToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name ="idproject", insertable = false, updatable=false)
	Project project;
	
	public String getId() {
		return id;
	}
	
	

	public void setId(String id) {
		this.id = id;
	}
	public String getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(String idEmployee) {
		this.idEmployee = idEmployee;
	}
	public String getIdProject() {
		return idProject;
	}
	public void setIdProject(String idProject) {
		this.idProject = idProject;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate fecha) {
		this.startDate = fecha;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getDedication() {
		return dedication;
	}
	public void setDedication(String dedication) {
		this.dedication = dedication;
	}
	

}
