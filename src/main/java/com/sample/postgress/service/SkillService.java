package com.sample.postgress.service;

import java.util.List;
import java.util.Optional;

import com.sample.postgress.entity.Skill;

public interface SkillService {
	
	List<Skill>findAll();
	
	Optional<Skill> findById(String ID);

	void insertSkill(Skill ski);

	void updateSkill(Skill ski);

	void deleteSkill(Skill ski);

}
