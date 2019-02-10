package com.bilgeadam.withoutgenerics;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<>();
		array.add(11);
		array.add(22);
		array.add(33);
		//array.add("Bilge Adam");
		array.add(44);
		array.add(55);
		
		printDoubled(array);
		
	}

	private static void printDoubled(ArrayList<Integer> array) {
		for (int i : array) {
			System.out.println(i*2);
		}
	
	}

}
