package com.bilgeadam.interfacedetails;

public class TestInterface extends TestClass implements Interface, Interface2, Interface3{
	
	public static void main(String[] args) {
		System.out.println(Interface.PI);
		new TestInterface().defaultMethod();
		Interface.staticMethod("bilgeadam");
	}

	@Override
	public void test2() {
		
	}

	@Override
	public int test2(int x) {
		return 0;
	}
	
	

//	@Override
//	public void defaultMethod() {
//		System.out.println("In the concrete default method");
//	}
//	
}
