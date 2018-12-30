package com.bilgeadam.access;

public class Main {

	public static void main(String[] args) {

		AccessTest accessTest  = new AccessTest();
		System.out.println(accessTest.a); // public
		System.out.println(accessTest.b); // protected
		System.out.println(accessTest.d); //default
		
		
		
	}

}
