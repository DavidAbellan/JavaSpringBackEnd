package com.sample.postgress.service;

import java.util.List;

import com.sample.postgress.entity.Skill;

public interface SkillService {
	
	List<Skill>findAll();

	void insertSkill(Skill ski);

	void updateSkill(Skill ski);

	void deleteSkill(Skill ski);

}
