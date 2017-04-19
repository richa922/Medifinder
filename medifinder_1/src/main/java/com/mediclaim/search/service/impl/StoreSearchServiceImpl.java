package com.mediclaim.search.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediclaim.model.Stores;
import com.mediclaim.search.dao.storeDao;
import com.mediclaim.search.service.StoreSearchService;

@Service
public class StoreSearchServiceImpl implements StoreSearchService {
	
	@Autowired
	storeDao storeDao;
	
	@Override
	public Stores getstore(List<Stores> med_name) {
		return new Stores();
	}

	@Override
	public List<Stores> getstore(String med_name) {
		return storeDao.getstore(med_name);
	}
}
