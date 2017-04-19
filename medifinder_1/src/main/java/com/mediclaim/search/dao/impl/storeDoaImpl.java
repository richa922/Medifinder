package com.mediclaim.search.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mediclaim.model.Stores;
import com.mediclaim.search.dao.storeDao;

@Repository
public class storeDoaImpl implements storeDao {

	@Autowired
	SessionFactory sessionFactory;
	
	private final String getstore = "select * FROM stores WHERE medicine_name like :med_name";  
	
	@Override
	public List<Stores> getstore(String med_name) {
		Session session = null;
		session = sessionFactory.openSession();
		Query query = session.createSQLQuery(getstore).setParameter("med_name", "%"+med_name+"%");
		@SuppressWarnings("unchecked")
		List<Stores> results = (List<Stores>)query.list();
		return results;
	}
}
