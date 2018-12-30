package com.bilgeadam.statics;

import java.util.Random;

public class StaticTest {

	public static void main(String[] args) {
		
		System.out.println(Math.E);;
		System.out.println(Math.random());

		Random random = new Random();
		System.out.println(random.nextInt(10));
		
		new StaticTest().test();
	}
	
	public static void test() {
		System.out.println("In the test class");
	}
	
	public final void test2() {
		int piInt=(int) Math.PI;
		System.out.println("In the test2 class");
	}
	
}
