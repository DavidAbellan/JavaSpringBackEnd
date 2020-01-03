package com.sample.postgress.service;

import java.util.List;

import com.sample.postgress.entity.EmployeeProjectPeriod;


public interface EmployeeProjectPeriodService {
	
	List<EmployeeProjectPeriod>findAll();

	void insertEmployeeProjectPeriod(EmployeeProjectPeriod abs);

	void updateEmployeeProjectPeriod(EmployeeProjectPeriod abs);

	void deleteEmployeeProjectPeriod(EmployeeProjectPeriod abs);

}
