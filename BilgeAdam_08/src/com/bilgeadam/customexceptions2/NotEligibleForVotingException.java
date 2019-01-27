package com.bilgeadam.customexceptions2;

public class NotEligibleForVotingException extends Exception {
	
	public NotEligibleForVotingException() {
		super();
	}
	
	public NotEligibleForVotingException(String message) {
		super(message);
	}
	
	public NotEligibleForVotingException(String message, Throwable cause) {
		super(message, cause);
	}
}
