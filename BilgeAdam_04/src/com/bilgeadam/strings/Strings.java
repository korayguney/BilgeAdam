package com.bilgeadam.strings;

import com.bilgeadam.memory.Car;

public class Strings {

	public static void main(String[] args) {

		// String literals
		String name1 = "Mustafa";
		String name2 = "Mustafa";

		// check string equality
		if (name1.equals(name2)) {
			System.out.println("name 1 and name2 is EQUAL");
		} else {
			System.out.println("name 1 and name2 is NOT EQUAL");
		}

		// check string memory points (in the heap [common poll])
		if (name1 == name2) {
			System.out.println("name 1 and name2 refers IDENTICAL memory address");
		} else {
			System.out.println("name 1 and name2 DOESN'T refer IDENTICAL memory address");
		}

		name2 = name1;
		name1 = "Ahmet";

		// check string equality
		if (name1.equals(name2)) {
			System.out.println("name 1 and name2 is EQUAL");
		} else {
			System.out.println("name 1 and name2 is NOT EQUAL");
		}

		// check string memory points (in the heap [common poll])
		if (name1 == name2) {
			System.out.println("name 1 and name2 refers IDENTICAL memory address");
		} else {
			System.out.println("name 1 and name2 DOESN'T refer IDENTICAL memory address");
		}

		System.out.println("*************************************************");

		// String objects
		String name3 = new String("Mustafa");
		String name4 = new String("Mustafa");

		// check string equality
		if (name3.equals(name4)) {
			System.out.println("name 3 and name 4 is EQUAL");
		} else {
			System.out.println("name 3 and name 4 is NOT EQUAL");
		}

		// check string memory points (in the heap [common poll])
		if (name3 == name4) {
			System.out.println("name 3 and name 4 refers IDENTICAL memory address");
		} else {
			System.out.println("name 3 and name 4 DOESN'T refer IDENTICAL memory address");

		}

		name4 = name3;
		name3 = new String("Ahmet");
		
		// check string equality
		if (name3.equals(name4)) {
			System.out.println("name 3 and name 4 is EQUAL");
		} else {
			System.out.println("name 3 and name 4 is NOT EQUAL");
		}

		// check string memory points (in the heap [common poll])
		if (name3 == name4) {
			System.out.println("name 3 and name 4 refers IDENTICAL memory address");
		} else {
			System.out.println("name 3 and name 4 DOESN'T refer IDENTICAL memory address");

		}

		System.out.println("*************************************************");

		Car car = new Car();
		Car car2 = new Car();
		System.out.println("Car 1 : " + car.getName() + ",Car 2 : " + car2.getName());
		if (car == car2) {
			System.out.println("car  and car 2 refers IDENTICAL memory address");
		} else {
			System.out.println("car and car 2 DOESN'T refer IDENTICAL memory address");
		}

		car = car2;
		car2.setName("Porsche");
		System.out.println("Car 1 : " + car.getName() + ",Car 2 : " + car2.getName());
		
		if (car == car2) {
			System.out.println("car  and car 2 refers IDENTICAL memory address");
		} else {
			System.out.println("car and car 2 DOESN'T refer IDENTICAL memory address");
		}
		
		
		
	}

}