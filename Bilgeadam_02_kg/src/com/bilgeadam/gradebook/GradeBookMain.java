package com.bilgeadam.gradebook;

import java.util.Scanner;

public class GradeBookMain {

	public static void main(String[] args) {

		GradeBook gradeBook = new GradeBook();
	
		System.out.println("Please enter grades from 0 to 100 :");
		
		gradeBook.takeInput();
		gradeBook.printReport();
	}
	
	
}
