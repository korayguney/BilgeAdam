package com.bilgeadam.withoutgenerics;

import java.util.ArrayList;

public class WithoutGenericExample {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(25);
		arr.add(30);
		arr.add(58);
		//arr.add("Merhaba");

		for (int i = 0; i < arr.size(); i++) {
			int x = (int) arr.get(i);
			x += 10;
			System.out.println(x);
		}

	}

}
