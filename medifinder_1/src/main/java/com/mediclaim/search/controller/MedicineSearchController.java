package com.mediclaim.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mediclaim.model.Hospital;
import com.mediclaim.model.Medicine;
import com.mediclaim.model.Model;
import com.mediclaim.model.Stores;
import com.mediclaim.model.Symptoms;
import com.mediclaim.search.service.HospitalSearchService;
import com.mediclaim.search.service.MedicineSearchService;
import com.mediclaim.search.service.StoreSearchService;
import com.mediclaim.search.service.SymptomSeachService;

@Controller
@RequestMapping("/services/search")
public class MedicineSearchController {

	@Autowired
	MedicineSearchService medicineService;
	
	@Autowired
	StoreSearchService storeService;
	
	@Autowired
	SymptomSeachService symptomSeachService;
	
	@Autowired
	HospitalSearchService hospitalSearchService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Medicine> getMedicine(@RequestParam(value = "name") String medicineName) {
		return medicineService.getMedicine(medicineName);
	}
	
	@RequestMapping(value = "/salt/{saltId}", method = RequestMethod.GET)
	@ResponseBody
	public <K extends Model> List<K> getMedicineBySalt(@PathVariable(value = "saltId") String salt_id) {
		
		List<Medicine> medicines = medicineService.getMedicine(salt_id); 
		
		if(!medicines.isEmpty())
		{
			return (List<K>) medicines;
		}
		
		List<Stores> stores = storeService.getstore(salt_id); 
		if(!stores.isEmpty())
		{
			return (List<K>) stores;
		}
		
		List<Symptoms> symptoms = symptomSeachService.getDisease(salt_id); 
		
		if(!symptoms.isEmpty())
		{
			return (List<K>) symptoms;
		}
		
		List<Hospital> hospitals = hospitalSearchService.getDisease(salt_id); 
		
		if(!hospitals.isEmpty())
		{
			return (List<K>) hospitals;
		}
		return null;
	}
}
