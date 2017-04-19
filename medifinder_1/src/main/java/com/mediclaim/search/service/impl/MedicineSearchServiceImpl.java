package com.mediclaim.search.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediclaim.model.Medicine;
import com.mediclaim.search.dao.MedicineDao;
import com.mediclaim.search.service.MedicineSearchService;

@Service
public class MedicineSearchServiceImpl implements MedicineSearchService {
	
	@Autowired
	MedicineDao medicineDao;
	
	@Override
	public Medicine getMedicine(List<Medicine> medicine) {
		return new Medicine();
	}

	@Override
	public List<Medicine> getMedicine(String medicineName) {
		return medicineDao.getMedicine(medicineName);
	}
	
	@Override
	public Medicine getMedicineBySalt(List<Medicine> medicine) {
		return new Medicine();
	}

	@Override
	public List<Medicine> getMedicineBySalt(String salt_id) {
		return medicineDao.getMedicineBySalt(salt_id);
	}
}
