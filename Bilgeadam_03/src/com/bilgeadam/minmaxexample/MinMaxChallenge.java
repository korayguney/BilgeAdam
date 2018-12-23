package com.bilgeadam.minmaxexample;

public class MinMaxChallenge {

	public static void main(String[] args) {

		int[] intArray = { 1, 25, 98, -45, 0, 17 };
		// new int[4];

		int resultMax = findMax(intArray);
		int resultMin = findMin(intArray);
		
		System.out.println("Max : " + resultMax ); 
		System.out.println("Min : " + resultMin ); 
		
		
	}

	private static int findMin(int[] intArray) {
		int temporary = intArray[0];

		for (int i = 1; i < intArray.length; i++) {
			if (temporary > intArray[i]) {
				temporary = intArray[i];
			}
		}
		//System.out.println("Mininmum number of the array is : " + temporary);
		return temporary;
	}

	private static int findMax(int[] intArray) {

		int temporary = intArray[0];

		for (int i = 1; i < intArray.length; i++) {
			if (temporary < intArray[i]) {
				temporary = intArray[i];
			}
		}
		//System.out.println("Maximum number of the array is : " + temporary);
		return temporary;
	}

}
