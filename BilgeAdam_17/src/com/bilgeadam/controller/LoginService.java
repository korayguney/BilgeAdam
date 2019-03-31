package com.bilgeadam.controller;

import com.bilgeadam.dao.UserDAO;

public class LoginService {

	public boolean validateUser(String username, String password) {
		if (username.length() != 0 && password.length() != 0) {
			boolean result = new UserDAO().getUser(username, password);
			if (result == true) {
				return true;
			} else {
				return false; // there is no valid user in db with this credentials
			}
		} else {
			return false; // username and/or password is empty
		}
	}

	public boolean saveUser(String username, String password) {
		if(username.length() != 0 && password.length() != 0) {
			boolean result = new UserDAO().setUser(username, password);
			if(result == true) {
				return true;
			} else {
				return false; // there is no valid user in db with this credentials
			}
		} else {
			return false; // username and/or password is empty
		}
	}

}
