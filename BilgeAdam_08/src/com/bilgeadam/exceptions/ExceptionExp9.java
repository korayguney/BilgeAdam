package com.bilgeadam.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionExp9 {

	
	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(new File("D:/BilgeAdam/JavaSE_sunum/missingpath.txt"));) {
			System.out.println("Started to read txt");
			System.out.println("Finished to read txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
