package com.sample.postgress.service;

import java.util.List;

import com.sample.postgress.entity.Absence;

public interface AbsenceService {
	
	List<Absence>findAll();

	void insertAbsence(Absence abs);

	void updateAbsence(Absence abs);

	void deleteAbsence(Absence abs);

}
