package com.mediclaim.user.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mediclaim.user.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;

	private final String getUserAuthentication = "select 1 FROM doctor WHERE doctor_firstname = :username and doctor_pwd = :password";

	@Override
	public boolean getAuthenticate(String username, String password) {
		Session session = null;
		session = sessionFactory.openSession();
		Query query = session.createSQLQuery(getUserAuthentication).setParameter("username", username)
				.setParameter("password", password);
		
		if((query.uniqueResult() != null) && (((Number) query.uniqueResult()).intValue() > 0))
		{
			return true;
		}

		return false;
	}
}
