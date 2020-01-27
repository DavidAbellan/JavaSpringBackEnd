package com.sample.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sample.postgress.entity.Skill;


public interface SkillRepository extends CrudRepository <Skill, String> {
	
	List<Skill>findAll();
	
	Optional<Skill>findById(String ID);
	
	

}
