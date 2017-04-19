package com.mediclaim.signup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediclaim.model.Doctor;
import com.mediclaim.signup.dao.SignUpDao;
import com.mediclaim.signup.service.SignUpService;

@Service
public class SignUpServiceImpl implements SignUpService {
	
	@Autowired
	SignUpDao signUpDao;

	@Override
	public void signUpDoctor(Doctor doctor) {
		signUpDao.signUpDoctor(doctor);
	}
}