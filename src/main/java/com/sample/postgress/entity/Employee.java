package com.sample.postgress.entity;


import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="employee")
public class Employee  {
	
	@Id
	@Column (name= "id")
	private String id;
	//@Column (name = "hire_date")
	//private LocalDate hireDate ;
	//hireDate date DEFAULT NULL
	@Column (name = "name")
	private String name;
	@Column (name = "surname")
	private String surname;
	@Column (name = "email")
	private String email;
	@Column (name = "password")
	private String password;
	
	//private Employee() {
	//	hireDate = hireDate.now();
	//}
	@OneToOne(fetch= FetchType.LAZY, optional = false)
	@MapsId("id")//maps id porque tanto employee como userpacaman tienen la misma(el mismo nombre en BBDD) clave primary 
	@JoinColumn (name="id", nullable=false)
	userPacman userpacman;
	
	
	@OneToMany(targetEntity = EmployeeProjectPeriod.class, cascade = CascadeType.ALL)
	@JoinColumn (name="idemployee")
	@JsonIgnoreProperties("employee")
    List<EmployeeProjectPeriod> employeeProjectPeriod;
	
	@OneToMany(targetEntity = Absence.class,cascade = CascadeType.ALL)
	@JoinColumn (name = "employeeid" )
	@JsonIgnoreProperties("employee")
    List <Absence> employeeAbsences;
	
	
	//Hay que crear la tabla
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "employeeproject",
			joinColumns = @JoinColumn(name = "employeeid"),
			inverseJoinColumns = @JoinColumn (name="projectid")
			)
	Set<Project> projectsEmployees;
	
	
	
	
	





	public List<Absence> getEmployeeAbsences() {
		return employeeAbsences;
	}


	public void setEmployeeAbsences(List<Absence> employeeAbsences) {
		this.employeeAbsences = employeeAbsences;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}





	//public LocalDate getHireData() {
	//	return hireDate;
	//}


	//public void setHireData(LocalDate hireData) {
	//	this.hireDate = hireData;
	//}

	
	 

	 
	
	
	
}