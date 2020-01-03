package com.sample.postgress.entity;


import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="user_pacman")

public class userPacman  {
	
	@Id
	@Column (name = "id")
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
	@OneToOne(mappedBy="userpacman", cascade= CascadeType.ALL)
	 Employee employee;
	
	


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


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	//public LocalDate getHireData() {
	//	return hireDate;
	//}


	//public void setHireData(LocalDate hireData) {
	//	this.hireDate = hireData;
	//}

	
	 

	 
	
	
	
}