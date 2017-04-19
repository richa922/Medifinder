package com.mediclaim.search.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediclaim.model.Hospital;
import com.mediclaim.search.dao.HospitalDao;
import com.mediclaim.search.service.HospitalSearchService;

@Service
public class HospitalSearchServiceImpl implements HospitalSearchService {

	@Autowired
	HospitalDao medicineDao;	
	
	@Override
	public List<Hospital> getDisease(String hospital) {
		return medicineDao.getHospitalByName(hospital);
	}

}
