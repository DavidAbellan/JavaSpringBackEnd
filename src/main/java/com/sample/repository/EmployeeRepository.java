package com.sample.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sample.postgress.entity.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, String> {
	
	List<Employee>findAll();
	
	Optional<Employee>findById(String Id);
	
	

}
