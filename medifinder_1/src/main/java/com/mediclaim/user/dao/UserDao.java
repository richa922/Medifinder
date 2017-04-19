package com.mediclaim.user.dao;

public interface UserDao {

	boolean getAuthenticate(String username, String password);
}
