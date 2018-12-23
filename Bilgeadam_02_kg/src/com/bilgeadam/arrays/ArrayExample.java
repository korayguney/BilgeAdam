package com.bilgeadam.arrays;

public class ArrayExample {

	public static void main(String[] args) {

		int[] integerArr = new int[10];

		integerArr[0] = 2;
		integerArr[1] = 2;
		integerArr[3] = 2;
		integerArr[5] = 2;
		integerArr[6] = 2;
		integerArr[7] = 2;
		integerArr[8] = 2;
		// integerArr[10]= 2;

		for (int i = 0; i < 10; i++) {

			System.out.println(i + ".index " + integerArr[i]);

		}

	}
}
