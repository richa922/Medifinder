package com.mediclaim.search.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mediclaim.model.Medicine;
import com.mediclaim.search.dao.MedicineDao;

@Repository
public class MedicineDaoImpl implements MedicineDao {

	@Autowired
	SessionFactory sessionFactory;
	
	private final String getMedicine = "select * FROM medicine WHERE medicine_name like :name";  
	private final String getMedicineBySalt = "select * FROM medicine WHERE medicine_salts_id like :salt_id";  
	
	@Override
	public List<Medicine> getMedicine(String name) {
		Session session = null;
		session = sessionFactory.openSession();
		Query query = session.createSQLQuery(getMedicine).setParameter("name", "%"+name+"%");
		@SuppressWarnings("unchecked")
		List<Medicine> results = (List<Medicine>)query.list();
		return results;
	}


	
	@Override
	public List<Medicine> getMedicineBySalt(String salt_id) {
		Session session = null;
		session = sessionFactory.openSession();
//		Query query = session.createSQLQuery(getMedicineBySalt).setParameter("salt_id", "%"+salt_id+"%");
		List<Medicine> results =  session.createCriteria(Medicine.class).add(Restrictions.like("medicine_salts_id", salt_id)).list();
		session.close();
		return results;
	}
}
