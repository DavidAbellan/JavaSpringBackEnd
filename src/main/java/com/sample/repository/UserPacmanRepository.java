package com.sample.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.sample.postgress.entity.userPacman;


public interface UserPacmanRepository extends CrudRepository<userPacman, String> {
	
	List<userPacman>findAll();
	

}
