package com.mediclaim.search.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mediclaim.model.Pill;
import com.mediclaim.search.dao.PillSearchDao;

@Repository
public class PillSearchDaoImpl implements PillSearchDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Pill> getPill(Pill pill) {
		Session session = null;
		session = sessionFactory.openSession();
		List<Pill> results = session.createCriteria(Pill.class).add(Restrictions.like("imprint", pill.getImprint()))
				.add(Restrictions.like("color", pill.getColor())).add(Restrictions.like("shape", pill.getShape()))
				.list();
		session.close();
		return results;
	}
}
