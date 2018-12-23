package com.bilgeadam.stackheap;

import java.util.*;
//import java.util.ResourceBundle;
//import java.util.Scanner;

public class HeapStackExample {

	
	private static Employee emp3;
	Scanner scanner;
	ResourceBundle rsaas;
	Random random;
	
	public static void main(String[] args) {
		
		// primitive types
		
//		int x = 50;
//		int y = x;
//		System.out.println("value of x: " + x + "\nvalue of y:" + y);
//		x = 100;
//		System.out.println("value of x: " + x + "\nvalue of y:" + y);
//		System.out.println("-----------------------------------------");
		// Reference types
		
		Employee emp1 = new Employee();
		emp1.setEmp_age(25);
		emp1.setEmp_departmant("IT");
		emp1.setEmp_name("Hasan Ali");
		
		Employee emp2 = emp1;
		System.out.println("Name of emp1: " + emp1.getEmp_name() + "\nName of emp2:" + emp2.getEmp_name());
		emp1.setEmp_name("Yýldýz Yaðcý");
		System.out.println("Name of emp1: " + emp1.getEmp_name() + "\nName of emp2:" + emp2.getEmp_name());
		
		System.out.println("-----------------------------------------");
		
		
		try {
			emp3 = (Employee) emp1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		emp1.setEmp_name("Anýl Alnýak");
		System.out.println("Name of emp1: " + emp1.getEmp_name() + "\nName of emp3:" + emp3.getEmp_name());
	}
	
	
	
	
	
	
}
