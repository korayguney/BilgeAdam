package com.bilgeadam.forloop;

public class BreakContinueExample {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			System.out.println("i : " + i);
			if (i == 5) {
				System.out.println("Number is 5, breaking the loop");
				break;
			}
		}
//		
//		System.out.println("----------------------");
		
//		for (int i = 1; i <= 10; i++) {
//
//			if (i == 5) {
//				System.out.println("Number is 5, will continue without 5");
//				continue;
//			}
//			System.out.println("i : " + i);
//		}

	}

}
