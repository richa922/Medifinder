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

import com.mediclaim.model.Symptoms;
import com.mediclaim.search.service.SymptomSeachService;

@Controller
@RequestMapping("/search")
public class SymptomSearchController {

	@Autowired
	SymptomSeachService symptomService;
	
	@RequestMapping(value = "/disease/{symptom}", method = RequestMethod.GET)
	public @ResponseBody List<Symptoms> getDisease(@PathVariable(value = "symptom") String symptom) {
		return symptomService.getDisease(symptom);
	}
}