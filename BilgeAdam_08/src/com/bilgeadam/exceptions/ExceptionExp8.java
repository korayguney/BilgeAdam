package com.bilgeadam.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExp8 {

	static Scanner scanner = null;
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Started to read txt");
			scanner = new Scanner(new File("D:/BilgeAdam/JavaSE_sunum/missingpath.txt")); // checked exception
			System.out.println("Finished to read txt");
//			System.exit(0);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if(scanner != null) {
				scanner.close();
				System.out.println("Resource closed");
			}
			System.out.println("Scanner resource is closed");
		}
	}
}
