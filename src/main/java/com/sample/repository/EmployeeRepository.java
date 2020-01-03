package com.sample.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.sample.postgress.entity.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, String> {
	
	List<Employee>findAll();
	

}
