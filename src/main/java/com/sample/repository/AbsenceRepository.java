package com.sample.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.sample.postgress.entity.Absence;


public interface AbsenceRepository extends CrudRepository <Absence, String> {
	
	List<Absence>findAll();
	

}
