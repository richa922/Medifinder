package com.mediclaim.search.dao;

import java.util.List;

import com.mediclaim.model.Stores;

public interface storeDao {
	List<Stores> getstore(String med_name);
}