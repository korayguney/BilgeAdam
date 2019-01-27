package com.bilgeadam.interfaceabstractrecap;

public interface Interface1 {

	public static final int TEST=100;
	
	public abstract boolean testInterfaceMethod(boolean result);
	
	public default void testDefaultMethod() {
		System.out.println("In the testDefaultMethod");
	}
	
	public static void testStaticMethod() {
		System.out.println("In the testStaticMethod");
	}
}
