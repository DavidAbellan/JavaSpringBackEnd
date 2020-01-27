package com.sample.postgress.service;

import java.util.List;
import java.util.Optional;

import com.sample.postgress.entity.Project;

public interface ProjectService {
	
	Optional<Project> findById(String Id);
	
	List<Project> findAll();

	void insertProject(Project pro);

	void updateProject(Project pro);

	void deleteProject(Project pro); 
	


}
