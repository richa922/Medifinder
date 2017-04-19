package com.mediclaim.search.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediclaim.model.Symptoms;
import com.mediclaim.search.dao.SymptomDao;
import com.mediclaim.search.service.SymptomSeachService;

@Service
public class SymptomSearchServiceImpl implements SymptomSeachService {
	
	@Autowired
	SymptomDao symptomDao;
	
	@Override
	public Symptoms getDisease(List<Symptoms> symptom) {
		return new Symptoms();
	}

	@Override
	public List<Symptoms> getDisease(String symptom) {
		return symptomDao.getDisease(symptom);
	}
}
