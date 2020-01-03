package com.sample.postgress.service;

import java.util.List;

import com.sample.postgress.entity.userPacman;

public interface userPacmanService {
	
	List<userPacman> findAll();


	void insertuserPacman(userPacman us) ;

	void updateuserPacman(userPacman us);

	void deleteuserPacman(userPacman us);

}
