package com.sample.postgress.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.postgress.entity.Absence;
import com.sample.repository.AbsenceRepository;

@Service
public class AbsenceServiceImpl implements AbsenceService{
	
	@Autowired
	AbsenceRepository AbsenceDao;
	@Override
	public List<Absence> findAll() {
		return AbsenceDao.findAll();
	}
	@Override
	public void insertAbsence(Absence abs) {
		AbsenceDao.save(abs);
		
	}
	@Override
	public void updateAbsence(Absence abs) {
		AbsenceDao.save(abs);
		
	};
    @Override
     public void deleteAbsence(Absence abs) {
    	AbsenceDao.delete(abs);
		
	}

}
