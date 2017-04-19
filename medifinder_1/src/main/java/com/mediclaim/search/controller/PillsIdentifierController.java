package com.mediclaim.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mediclaim.model.Pill;
import com.mediclaim.search.service.PillSearchService;

@Controller
@RequestMapping("/services/search")
public class PillsIdentifierController {

	@Autowired
	PillSearchService pillsService;
	
	@RequestMapping(value = "/Pill/", method = RequestMethod.POST)
	@ResponseBody
	public List<Pill> getPill(@RequestBody Pill pill) {
		List<Pill> pills = pillsService.getPill(pill); 
		return pills;
	}
}
