package com.bilgeadam.conditions;

public class SwitchExample {

	public static void main(String[] args) {

		String name = "Gokhan";

		switch (name) {
			case "Gokhan":
				System.out.println("Welcome " + name);
				break;
			case "Koray":
				System.out.println("Welcome " + name);
				System.out.println("test");
				break;
			case "Mehmet":
				System.out.println("Welcome " + name);
				break;
			default:
				System.out.println("Welcome nobody");
				break;
		}
		
		System.out.println("*****************************");
		
		char expChar = 'B';
		int x = 34;
		
		switch (expChar) {
		case 'A':   
		case 'C': 
		case 'D': case 'E':
			System.out.println("Char is A");
			break;
		case 'B':
			if (x > 20) {
				System.out.println("X is bigger then 20");
			} else {
				System.out.println("X is smaller then 20");
			}
			
//			System.out.println("Char is B");
			break;
			
		default:
			break;
		}
		
		
		
		
		
		
		
		
		
	}

}
