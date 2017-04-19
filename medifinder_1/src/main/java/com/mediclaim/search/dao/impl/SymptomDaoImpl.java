package com.mediclaim.search.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mediclaim.model.Symptoms;
import com.mediclaim.search.dao.SymptomDao;

@Repository
public class SymptomDaoImpl implements SymptomDao {

	@Autowired
	SessionFactory sessionFactory;
	
	private final String getDisease = "select * FROM symptoms WHERE symptoms_name like :symptom";  
	
	@Override
	public List<Symptoms> getDisease(String symptom) {
		Session session = null;
		session = sessionFactory.openSession();
		Query query = session.createSQLQuery(getDisease).setParameter("symptom", "%"+symptom+"%");
		@SuppressWarnings("unchecked")
		List<Symptoms> results = (List<Symptoms>)query.list();
		return results;
	}
}
