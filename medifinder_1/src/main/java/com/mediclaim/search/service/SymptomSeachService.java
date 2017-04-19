package com.mediclaim.search.service;

import java.util.List;

import com.mediclaim.model.Symptoms;

public interface SymptomSeachService
{

	public List<Symptoms> getDisease(String symptom);

	public Symptoms getDisease(List<Symptoms> symptomsList);
}
