package com.bilgeadam.controller;

import com.bilgeadam.DAO.UserDAO;

public class LoginService {

	public boolean validateUser(String username, String password) {
		if(username.length() != 0 || password.length() != 0) {
			boolean result = new UserDAO().getUser(username, password);
			if(result == true) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
