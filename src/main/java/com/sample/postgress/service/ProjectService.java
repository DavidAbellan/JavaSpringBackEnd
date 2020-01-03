package com.sample.postgress.service;

import java.util.List;

import com.sample.postgress.entity.Employee;
import com.sample.postgress.entity.Project;

public interface ProjectService {
	
	List<Project> findAll();

	void insertProject(Project pro);

	void updateProject(Project pro);

	void deleteProject(Project pro); 
	


}
