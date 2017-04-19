package com.mediclaim.search.dao;

import java.util.List;

import com.mediclaim.model.Hospital;

public interface HospitalDao {

	List<Hospital> getHospitalByName(String hospital);

}
