package com.bilgeadam.gradebook;

import java.util.Scanner;

public class GradeBook {
	
	int total = 0;
	int gradeCounter = 0;
	static int aGrade = 0;
	int bGrade = 0;
	int cGrade = 0;
	int dGrade = 0;
	int fGrade = 0;

	Scanner input = new Scanner(System.in);
	
	
	void takeInput() {
		while (input.hasNext()) {
			int grade = input.nextInt();
			total = total + grade;
			gradeCounter++;
			
			calculateGrade(grade);
		}
	}
	
	
	void calculateGrade (int grade) {
		switch (grade/10) {
		case 9: case 10:
			aGrade++;
			break;
		case 8: 
			bGrade++;
			break;
		case 7: 
			cGrade++;
			break;
		case 6: 
			dGrade++;
			break;
		default:
			fGrade++;
			break;
		}
	}
	
	
	
	
	
	void printReport() {
		System.out.println("Grade report :");
		System.out.println("***************");
		
		if(gradeCounter == 0) {
			System.err.println("No grade is entered!");
		} else {
			double average = (double) total / gradeCounter;
			System.out.printf("Total of entered grade is %d and average of class is %.2f \n", gradeCounter, average);
			
			System.out.println("\nNumber of grades : \n\tA: " + aGrade + "\n\tB: " + bGrade + "\n\tC: " + cGrade + "\n\tD: " + dGrade + "\n\tF: " + fGrade);
		}
		
	}
	

}
