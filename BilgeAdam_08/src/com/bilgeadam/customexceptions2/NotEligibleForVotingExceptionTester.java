package com.bilgeadam.customexceptions2;

public class NotEligibleForVotingExceptionTester {

	public static void main(String[] args) throws NotEligibleForVotingException {
		
		getAge(15);
		
	}

	public static void getAge(int age) throws NotEligibleForVotingException {
		if(age < 18) {
			throw (new NotEligibleForVotingException("Too young", new Throwable("He/She is under 18")));
		}
		
		System.out.println("Eligible to vote !");
		
	}
	
	
}
