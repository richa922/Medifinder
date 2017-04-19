package com.mediclaim.signup.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mediclaim.model.Doctor;
import com.mediclaim.signup.dao.SignUpDao;

@Repository
public class SignUpDaoImpl implements SignUpDao {

	@Autowired
	SessionFactory sessionFactory;
	
	private final String insertingrole = "insert into authorities(username, authority) values(:name, :role)";
	private String role = "ROLE_ADMIN";
	
	@Override
	public void signUpDoctor(Doctor doctor) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(doctor);
		if(!doctor.getSpeciality().equals("Doctor"))
		{
			role ="ROLE_USER";
		}
		Query query = session.createSQLQuery(insertingrole).setParameter("name", doctor.getDoctor_emailId()).setParameter("role", role);
		
		query.executeUpdate();
		session.flush();
		session.clear();
		session.getTransaction().commit();
		session.close();
	}
}