package com.bilgeadam.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionExp2 {

	public static void main(String[] args)  {
		try {
			System.out.println("Starting to read file");
			Scanner scanner = new Scanner(new File("missingpath.txt"));
			System.out.println("Finished to read file");
		} catch (FileNotFoundException f) {
			System.out.println(f.getMessage());
			f.printStackTrace();
			System.out.println("File is not exist on its path!");
		} 

		System.out.println("Leaving main method");
		
	}
}
