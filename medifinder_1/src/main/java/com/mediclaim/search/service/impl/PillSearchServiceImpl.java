package com.mediclaim.search.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediclaim.model.Pill;
import com.mediclaim.search.dao.PillSearchDao;
import com.mediclaim.search.service.PillSearchService;

@Service
public class PillSearchServiceImpl implements PillSearchService {
	
	@Autowired
	PillSearchDao pillSearchDao;

	@Override
	public List<Pill> getPill(Pill pill) {
		return pillSearchDao.getPill(pill);
	}

}
