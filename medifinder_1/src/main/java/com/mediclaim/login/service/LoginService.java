package com.mediclaim.login.service;

/**
 * @author richasharma
 *
 */
public interface LoginService {

	/**
	 * @param username
	 * @param password
	 * @return
	 */
	boolean getAuthenticate(String username, String password);
}
