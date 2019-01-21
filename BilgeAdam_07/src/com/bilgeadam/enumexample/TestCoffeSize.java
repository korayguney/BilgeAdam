package com.bilgeadam.enumexample;

import java.time.DayOfWeek;
import java.util.Iterator;

public class TestCoffeSize {

	public static void main(String[] args) {

		CoffeeSize coffeeSize1 = CoffeeSize.LARGE;
		CoffeeSize coffeeSize2 = CoffeeSize.MEDIUM;
		CoffeeSize coffeeSize3 = CoffeeSize.SMALL;
		String ingredient = CoffeeSize.LARGE.getIngredient();
		
		System.out.println(ingredient);
		System.out.println("---------------------------");
		CoffeeSize[] coffeeSizes = { coffeeSize1, coffeeSize2, coffeeSize3 };

		int totalprice = 0;

		for (CoffeeSize coffeeSize : coffeeSizes) {
			totalprice += coffeeSize.getPrice();
			System.out.println("Purchased coffee size : " + coffeeSize.getSize());
			System.out.println(coffeeSize.getIngredient());
		}

		System.out.println("Total price of purchased coffees : " + totalprice + " $");

		if (coffeeSize1 == CoffeeSize.MEDIUM) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		switch (coffeeSize1) {
		case LARGE:
			System.out.println("size is large");
			break;
		case MEDIUM:
			System.out.println("size is medium");
			break;
		default:
			System.out.println("size is not determined");
			break;
		}

		for (CoffeeSize coffeeSize : CoffeeSize.values()) {
			System.out.println(coffeeSize);
		}

		for (DayOfWeek days : DayOfWeek.values()) {
			System.out.println(days);
		}

	}
}
