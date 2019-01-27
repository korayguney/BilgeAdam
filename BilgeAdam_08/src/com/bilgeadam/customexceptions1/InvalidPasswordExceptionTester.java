package com.bilgeadam.customexceptions1;

public class InvalidPasswordExceptionTester {

	String user_pass = "koray1234";
	
	public static void main(String[] args) throws InvalidPasswordException {
		InvalidPasswordExceptionTester inew = new InvalidPasswordExceptionTester();
		inew.setPassword("koray1234");
	}

	public void setPassword(String password) throws InvalidPasswordException {
		if(password.equals(user_pass)) {
			System.out.println("Welcome to hell");
		} else {
			throw new InvalidPasswordException("Password is wrong");
		}
	}
	
}
