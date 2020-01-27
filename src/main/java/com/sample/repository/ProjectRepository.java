package com.sample.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sample.postgress.entity.Project;


public interface ProjectRepository extends CrudRepository <Project, String> {
	
	List<Project>findAll();
	Optional<Project>findById(String Id);

	
	

}
