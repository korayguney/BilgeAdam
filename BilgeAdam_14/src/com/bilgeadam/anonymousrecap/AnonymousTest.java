package com.bilgeadam.anonymousrecap;

public class AnonymousTest {
	
	@FunctionalInterface
	interface Calculatable {
		public abstract double multiply(double a, double b);
		public static double multiply2(double a, double b) {
			return b;
		};
		default void test() {
			
		}
	}
	
	public static double calculate(Calculatable c, double a, double b) {
		return c.multiply(a, b);
	}
	
	public static void main(String[] args) {
		
		double result = calculate((a, b) -> a * b, 5, 8);
		System.out.println(result);
	}
	
}
