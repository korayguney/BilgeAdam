package com.bilgeadam.customexceptions1;

public class InvalidPasswordException extends Exception {

	public InvalidPasswordException() {
		super();
	}
	
	public InvalidPasswordException(String message) {
		super(message);
	}
	
	public InvalidPasswordException(Throwable cause) {
		super(cause);
	}
	
	public InvalidPasswordException(String message, Throwable cause) {
		super(message, cause);
	}
	
	
}
