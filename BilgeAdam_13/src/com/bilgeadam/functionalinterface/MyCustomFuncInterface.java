package com.bilgeadam.functionalinterface;

@FunctionalInterface
public interface MyCustomFuncInterface {
	
	public abstract void test(int a);

	static void teststatic() {
		
	}
	
	default void testdefault() {
		
	}
}
