package com.sample.postgress.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.postgress.entity.userPacman;
import com.sample.repository.UserPacmanRepository;
@Service 
public class userPacmanServiceImpl implements userPacmanService{
	@Autowired
	UserPacmanRepository userPacmanDao;
	@Override
	public List<userPacman> findAll() {
		return userPacmanDao.findAll();
	}
	@Override
	public void insertuserPacman(userPacman us) {
		userPacmanDao.save(us);
		
	}
	@Override
	public void updateuserPacman(userPacman us) {
		userPacmanDao.save(us);
		
	};
    @Override
     public void deleteuserPacman(userPacman us) {
		userPacmanDao.delete(us);
		
	}
}
