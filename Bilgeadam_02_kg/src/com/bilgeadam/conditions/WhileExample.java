package com.bilgeadam.conditions;

public class WhileExample {

	public static void main(String[] args) {

		int a = 2;

		while (a < 10) {
			System.out.println(a + " value is smaller then 10");
			a++;
		}

		System.out.println("------------------");

		do {
			System.out.println("In the do while");
			System.out.println(a + " value is smaller then 10");
		} while (a > 10);

		
		
	}

}
