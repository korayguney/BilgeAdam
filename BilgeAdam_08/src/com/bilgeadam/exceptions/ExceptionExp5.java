package com.bilgeadam.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExp5 {
	
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Entered main()");
		methodA();
		System.out.println("Exit main()");
	}

	public static void methodA() throws FileNotFoundException  {
		System.out.println("Entered methodA()");
		try {
			methodB();
		} catch (ArithmeticException e) {
			System.out.println("Devide by 0 exception");
		} catch (IOException e) {
			// TODO: handle exception
		}
		System.out.println("Exit methodA()");
	}
	
	public static void methodB() throws FileNotFoundException {
		System.out.println("Entered methodB()");
		methodC();
		System.out.println("Exit methodB()");
	}
	
	public static void methodC() throws ArithmeticException,FileNotFoundException
	{
		System.out.println("Entered methodC()");
		System.out.println(1/0);
		System.out.println("Exit methodC()");
	}
}
