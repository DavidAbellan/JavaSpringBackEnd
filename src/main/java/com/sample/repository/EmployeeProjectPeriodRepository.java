package com.sample.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sample.postgress.entity.EmployeeProjectPeriod;


public interface EmployeeProjectPeriodRepository extends CrudRepository <EmployeeProjectPeriod, String> {
	
	List<EmployeeProjectPeriod>findAll();
	}
	
