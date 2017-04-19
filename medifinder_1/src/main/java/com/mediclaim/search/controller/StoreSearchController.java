package com.mediclaim.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mediclaim.model.Stores;
import com.mediclaim.search.service.StoreSearchService;


@Controller
@RequestMapping("/search")
public class StoreSearchController {

	@Autowired
	StoreSearchService storeService;

	@RequestMapping(value="/store/{med_name}",method = RequestMethod.GET)
	@ResponseBody
	public List<Stores> getstore(@PathVariable(value = "med_name") String med_name)
			{
		return storeService.getstore(med_name);
	}
}