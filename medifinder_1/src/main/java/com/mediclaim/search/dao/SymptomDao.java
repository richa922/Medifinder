package com.mediclaim.search.dao;

import java.util.List;


import com.mediclaim.model.Symptoms;

public interface SymptomDao
{
	List<Symptoms> getDisease(String symptom) ;
}
