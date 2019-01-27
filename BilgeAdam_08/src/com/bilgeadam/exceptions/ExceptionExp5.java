package com.bilgeadam.exceptions;

public class ExceptionExp5 {
	
	public static void main(String[] args) {
		System.out.println("Entered main()");
		methodA();
		System.out.println("Exit main()");
	}

	public static void methodA()  {
		System.out.println("Entered methodA()");
		try {
			methodB();
		} catch (ArithmeticException e) {
			System.out.println("Devide by 0 exception");
		}
		System.out.println("Exit methodA()");
	}
	
	public static void methodB() {
		System.out.println("Entered methodB()");
		methodC();
		System.out.println("Exit methodB()");
	}
	
	public static void methodC() throws ArithmeticException{
		System.out.println("Entered methodC()");
		System.out.println(1/0);
		System.out.println("Exit methodC()");
	}
}
