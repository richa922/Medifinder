package com.mediclaim.search.service;

import java.util.List;


import com.mediclaim.model.Stores;
public interface StoreSearchService {
	
	public List<Stores> getstore(String med_name);

	public Stores getstore(List<Stores> medicine);
}
