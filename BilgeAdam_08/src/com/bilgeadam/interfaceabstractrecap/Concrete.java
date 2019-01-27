package com.bilgeadam.interfaceabstractrecap;

public class Concrete extends Abstract1 implements Interface1, Interface2 {

	@Override
	public int test(int c) {
		return super.test(c);
	}
	
	
	@Override
	public void testAbstractMethod() {
		System.out.println("test");
	}


	@Override
	public String testAbstractMethod2() {
		return null;
	}


	@Override
	public boolean testInterfaceMethod(boolean result) {
		return true;
	}


	@Override
	public boolean testInterfaceMethod2(boolean result) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
}
