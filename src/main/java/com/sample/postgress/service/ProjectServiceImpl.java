package com.sample.postgress.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.postgress.entity.Employee;
import com.sample.postgress.entity.Project;
import com.sample.repository.ProjectRepository;
@Service 
public class ProjectServiceImpl implements ProjectService{
	@Autowired
	ProjectRepository ProjectDao;
	@Override
	public List<Project> findAll() {
		return ProjectDao.findAll();
	}
	@Override
	public void insertProject(Project pro) {
		ProjectDao.save(pro);
		
	}
	@Override
	public void updateProject(Project pro) {
		ProjectDao.save(pro);
		
	};
    @Override
     public void deleteProject(Project pro) {
		ProjectDao.delete(pro);
		
	}
	
}
