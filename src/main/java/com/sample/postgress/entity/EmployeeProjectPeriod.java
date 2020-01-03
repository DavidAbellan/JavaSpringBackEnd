package com.sample.postgress.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="employeeprojectperiod")
public class EmployeeProjectPeriod {
	@Id
	@Column (name= "id")
	private String id;
	@Column (name= "idemployee")
	private String idEmployee;
	@Column (name= "idproject")
	private String idProject;
	@Column (name = "startdate")
	private String startDate;
	@Column (name = "enddate")
	private String endDate;
	@Column (name = "dedication")
	private String dedication;
	
	@ManyToOne
	@JoinColumn(name="idemployee",insertable = false, updatable = false)
    Employee employee;
	
	
	public String getId() {
		return id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
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
	public String getDedication() {
		return dedication;
	}
	public void setDedication(String dedication) {
		this.dedication = dedication;
	}
	

}
