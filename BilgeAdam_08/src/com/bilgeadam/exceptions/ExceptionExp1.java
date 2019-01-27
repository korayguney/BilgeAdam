package com.bilgeadam.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionExp1 {

	public static void main(String[] args)  {
		try {
			System.out.println("Starting to read file");
			Scanner scanner = new Scanner(new File("D:/BilgeAdam/JavaSE_sunum/test.docx"));
			System.out.println(scanner.nextLine());
			System.out.println("Finished to read file");
		} catch (NullPointerException e) {
			System.out.println("Null pointer exception");
		} catch (FileNotFoundException f) {
			System.out.println("File is not exist on its path!");
		} 
//		catch ( NoSuchElementException e) {
//			System.out.println("The reading operation is not suitable with this kind of document");
//		}
		
		System.out.println("Leaving main method");
		
	}
}
