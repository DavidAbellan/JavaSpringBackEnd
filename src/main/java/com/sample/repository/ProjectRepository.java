package com.sample.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.sample.postgress.entity.Employee;
import com.sample.postgress.entity.Project;


public interface ProjectRepository extends CrudRepository <Project, String> {
	
	List<Project>findAll();

	
	

}
