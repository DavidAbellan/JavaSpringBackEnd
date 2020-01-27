package com.sample.postgress.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.postgress.entity.Employee;
import com.sample.repository.EmployeeRepository;
@Service 
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepository EmployeeDao;
	@Override
	public List<Employee> findAll() {
		return EmployeeDao.findAll();
	}
	@Override
	public void insertEmployee(Employee emp) {
		EmployeeDao.save(emp);
		
	}
	@Override
	public void updateEmployee(Employee emp) {
		EmployeeDao.save(emp);
		
	};
    @Override
     public void deleteEmployee(Employee emp) {
		EmployeeDao.delete(emp);
		
	}
    @Override
    public Optional<Employee> findById(String id){
		return EmployeeDao.findById(id);
    	
    }
	
  
    
}
