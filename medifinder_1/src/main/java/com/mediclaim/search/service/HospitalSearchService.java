package com.mediclaim.search.service;

import java.util.List;

import com.mediclaim.model.Hospital;

public interface HospitalSearchService {
	public List<Hospital> getDisease(String hospital);
}
