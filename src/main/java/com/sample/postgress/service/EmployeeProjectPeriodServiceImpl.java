package com.sample.postgress.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.postgress.entity.EmployeeProjectPeriod;
import com.sample.repository.EmployeeProjectPeriodRepository;
@Service
public class EmployeeProjectPeriodServiceImpl implements EmployeeProjectPeriodService{
	@Autowired
	EmployeeProjectPeriodRepository EmployeeProjectPeriod;
	@Override
	public List<EmployeeProjectPeriod> findAll() {
		return EmployeeProjectPeriod.findAll();
	}
	@Override
	public void insertEmployeeProjectPeriod(EmployeeProjectPeriod emp) {
		EmployeeProjectPeriod.save(emp);
		
		
	}
	@Override
	public void updateEmployeeProjectPeriod(EmployeeProjectPeriod emp) {
		EmployeeProjectPeriod.save(emp);
		
	};
    @Override
     public void deleteEmployeeProjectPeriod(EmployeeProjectPeriod emp) {
    	EmployeeProjectPeriod.delete(emp);
		
	}
}