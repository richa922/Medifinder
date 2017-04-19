package com.mediclaim.login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediclaim.login.service.LoginService;
import com.mediclaim.user.dao.UserDao;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	UserDao userDao;
	
	@Override
	public boolean getAuthenticate(String username, String password) {
		return userDao.getAuthenticate(username, password);
	}
}
