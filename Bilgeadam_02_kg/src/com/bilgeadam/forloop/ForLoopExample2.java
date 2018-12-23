package com.bilgeadam.forloop;

import java.util.Scanner;

public class ForLoopExample2 {

	void withWhile() {

		int a = 1;
		int sum = 0;
		while (a <= 5) {
			sum += a;
			a++; //increment
		}
		System.out.println("Sum with \"while\"" + sum);
	}

	void withFor() {
		
		int sum =0;
		for (int i = 1; i < 6; i++) {
			sum+=i;
		}
		System.out.println("Sum with \"for\"" + sum);
	}
	
	void withUserInput() {
		System.out.println("Please enter 5 digit;");
		Scanner input = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum += input.nextInt();
		}
		System.out.println("Sum with \"user input\"" + sum);
	}
	
}
