package com.mediclaim.search.service;

import java.util.List;

import com.mediclaim.model.Medicine;

public interface MedicineSearchService {

	public List<Medicine> getMedicine(String medicineName);

	public Medicine getMedicine(List<Medicine> medicine);

	public List<Medicine> getMedicineBySalt(String salt_id);

	public Medicine getMedicineBySalt(List<Medicine> medicine);
}
