package com.bilgeadam.staticchallenge;

public class Calculator {

	static int sum = 0;
	static int substract = 0;
	static int divide = 0;
	static int multiply = 0;
	static int pow = 0;

	protected static double sum(double... input) {

		double result = 0;

		for (int i = 0; i < input.length; i++) {
			result += input[i];
		}
		sum++;
		return result;
	}

	protected static double substract(double a, double b) {
		substract++;
		return a - b;
	}

	protected static double divide(double a, double b) {
		divide++;
		return a / b;
	}

	protected static double multiply(double... input) {

		double result = 1;

		for (int i = 0; i < input.length; i++) {
			result *= input[i];
		}
		multiply++;
		return result;
	}

	protected static double pow(double input, int expo) {

		double result = 1;

		for (int i = 0; i < expo; i++) {
			result *= input;
		}
		pow++;
		return result;
	}

	static void getInfo() {
		System.out.println("Exec # of sum: " + sum);
		System.out.println("Exec # of substract: " + substract);
		System.out.println("Exec # of divide: " + divide);
		System.out.println("Exec # of multiply: " + multiply);
		System.out.println("Exec # of pow: " + pow);
	}

}
