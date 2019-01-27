package com.bilgeadam.exceptions;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionExp3 {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File("missingpath.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File is not exist on its path!");
		} catch (IOException | RuntimeException f) {
			
		} catch (Exception e) {
			
		} 
//		catch (Throwable e) {
//			   // never catch it
//		}

		try {
			Integer[] array = new Integer[5];
			System.out.println(1 / 0);
			System.out.println(array[0] + 5);
		} catch (NullPointerException e) {
			System.out.println("The array has null elements");
		} catch (ArithmeticException e) {
			System.out.println("You cannot devide to zero");
		}

	}
}
