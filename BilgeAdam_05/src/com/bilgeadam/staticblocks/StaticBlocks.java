package com.bilgeadam.staticblocks;

public class StaticBlocks {

	static int a;
	static String b;
	
	// String b;
	public static void main(String[] args) {
		System.out.println("In the main method");
		System.out.println("static a : " + a + " , string b: " + b);
	}
	
	// static initializer
	static {
		a = 10;
		b = "Test";
		test();
		System.out.println("In the static block");
	}
	
	static void test() {
		System.out.println("in the test method");
	}
	
	
}
