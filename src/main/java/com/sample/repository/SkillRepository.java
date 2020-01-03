package com.sample.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.sample.postgress.entity.Skill;


public interface SkillRepository extends CrudRepository <Skill, String> {
	
	List<Skill>findAll();
	

}
