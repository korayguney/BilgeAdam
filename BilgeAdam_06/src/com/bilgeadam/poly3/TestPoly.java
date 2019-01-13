package com.bilgeadam.poly3;

public class TestPoly {
	
	public static void main(String[] args) {
		
		
		A a1 = new C();
		//System.out.println(a1);
		
		B b1 = (B)a1; // downcasting -- explicit cast
		C c1 = (C)b1; // downcasting
		
		System.out.println(b1);
		
		A a2 = new B(); // upcasting
		System.out.println(a2); // B
		B b2 = (B) a2; // downcast -- OK!
		
		if(a2 instanceof C) {
			C c2 = (C) a2; // downcast -- compile OK, runtime error
		} else {
			System.out.println("Cannot cast");
		}
			
		
	}

}
