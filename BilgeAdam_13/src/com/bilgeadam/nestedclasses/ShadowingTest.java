package com.bilgeadam.nestedclasses;

public class ShadowingTest extends Object{

	private int x = 10;
	
	// Member inner (nested) class 
	private class InnerClass {
		
		private int x = 100;
		
		public void testShadowing(int x) {
			System.out.println("x : " + x); // 10000
			System.out.println("this.x : " + this.x); // 100
			System.out.println("ShadowingTest.this.x : " + ShadowingTest.this.x); // 10
		}
	}
	
	public static void main(String[] args) {
		ShadowingTest.InnerClass inner = new ShadowingTest().new InnerClass();
		inner.testShadowing(10000);
	}
}
