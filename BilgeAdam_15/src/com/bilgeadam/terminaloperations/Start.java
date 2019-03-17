package com.bilgeadam.terminaloperations;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Person person = new Person();
		
		System.out.println("==== PLEASE WRITE YOUR NAME ====");
		person.setName(scanner.nextLine());
		
		System.out.println("==== PLEASE WRITE YOUR AGE ====");
		
		try {
			person.setAge(Integer.valueOf(scanner.nextLine()));
		} catch (NumberFormatException e) {
			System.err.println("Please write just as integer");
			System.exit(1);
		}
		
		System.out.println("====== PERSON INFO ====");
		System.out.println("Person name : " + person.getName());
		System.out.println("Person age : " + person.getAge());
	}

}
