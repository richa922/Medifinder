package com.mediclaim.search.dao;

import java.util.List;

import com.mediclaim.model.Pill;

public interface PillSearchDao {

	List<Pill> getPill(Pill pill);

}
