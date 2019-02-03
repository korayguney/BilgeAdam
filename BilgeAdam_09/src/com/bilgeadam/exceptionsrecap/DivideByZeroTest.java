package com.bilgeadam.exceptionsrecap;

public class DivideByZeroTest {

	public static void main(String[] args) throws DivideByZeroException {
		divide(15, 0);
	}

	public static void divide(int a, int b) throws DivideByZeroException {
		try {
			System.out.println(a / b);
		} catch (Exception e) {
			// e.printStackTrace();
			throw new DivideByZeroException("The second number is zero");
		}
	}

}
