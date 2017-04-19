package com.mediclaim.search.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mediclaim.model.Hospital;
import com.mediclaim.search.dao.HospitalDao;

@Repository
public class HospitalDaoImpl implements HospitalDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	private final String getHospital = "select * FROM hospital WHERE hospital_name like :name"; 

	@Override
	public List<Hospital> getHospitalByName(String hospital) {
		Session session = null;
		session = sessionFactory.openSession();
		Query query = session.createSQLQuery(getHospital).setParameter("name", "%"+hospital+"%");
		@SuppressWarnings("unchecked")
		List<Hospital> results = (List<Hospital>)query.list();
		return results;
	}
}
