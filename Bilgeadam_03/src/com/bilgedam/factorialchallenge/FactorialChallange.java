package com.bilgedam.factorialchallenge;

public class FactorialChallange {

	public static void main(String[] args) {
		calculateFactorialWithForLoop(5);
		calculateFactorialWithWhileLoop(5);
	}

	static void calculateFactorialWithForLoop(int a) {
		long result = 1l;
		for (int i = 1; i <= a; i++) {
			// result = i * (i+1);
			result *= i;
		}

		System.out.println("Result with for loop : " + result);
	}

	static void calculateFactorialWithWhileLoop(int a) {
		long result = 1l;
		int i = 1;

		while (i <= a) {
			result *= i;
			i++;
		}

		System.out.println("Result with while loop : " + result);
	}

}
