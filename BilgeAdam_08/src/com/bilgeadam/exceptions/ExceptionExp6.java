package com.bilgeadam.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionExp6 {
	
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Entered main()");
		methodA();
		System.out.println("Exit main()");
	}

	public static void methodA() throws FileNotFoundException  {
		System.out.println("Entered methodA()");
		methodB();
		System.out.println("Exit methodA()");
	}
	
	public static void methodB() throws FileNotFoundException  {
		System.out.println("Entered methodB()");
		methodC();
		System.out.println("Exit methodB()");
	}
	
	public static void methodC() throws FileNotFoundException {
		System.out.println("Entered methodC()");
		Scanner scanner = new Scanner(new File("missingfile.txt"));
		System.out.println("Exit methodC()");
	}
}
