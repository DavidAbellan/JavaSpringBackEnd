package com.sample.postgress.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.postgress.entity.Skill;
import com.sample.repository.SkillRepository;
@Service 
public class SkillServiceImpl implements SkillService{
	@Autowired
	SkillRepository SkillDao;
	@Override
	public List<Skill> findAll() {
		return SkillDao.findAll();
	}
	@Override
	public void insertSkill(Skill ski) {
		SkillDao.save(ski);
		
	}
	@Override
	public void updateSkill(Skill ski) {
		SkillDao.save(ski);
		
	};
    @Override
     public void deleteSkill(Skill ski) {
		SkillDao.delete(ski);
		
	}
}