package com.mediclaim.search.dao;

import java.util.List;

import com.mediclaim.model.Medicine;

public interface MedicineDao {
	/**
	 * @param name
	 * @param disease
	 * @return
	 */
	List<Medicine> getMedicine(String name);

	/**
	 * @param salt_id
	 * @return
	 */
	List<Medicine> getMedicineBySalt(String salt_id);
}