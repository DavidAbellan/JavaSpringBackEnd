package com.sample.postgress.service;

import java.util.List;
import java.util.Optional;

import com.sample.postgress.entity.Employee;

public interface EmployeeService {
	List<Employee> findAll();
	
	Optional<Employee> findById(String id);
	

	void insertEmployee(Employee emp);

	void updateEmployee(Employee emp);

    void deleteEmployee(Employee emp);
    
  
	
}
