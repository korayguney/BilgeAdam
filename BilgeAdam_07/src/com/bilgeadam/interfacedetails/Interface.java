package com.bilgeadam.interfacedetails;

public interface Interface extends Interface3 {
	
	double PI = 3.14;
	
	public int test2(int x);
	
	public default void defaultMethod() {
		System.out.println("In the default method");
	}
	
	public static void staticMethod(String s) {
		System.out.println(" In the static method "  + s);
	}
	
}
