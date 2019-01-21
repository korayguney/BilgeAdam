package com.bilgeadam.abstractandinterface;

public class TestAnimal {
	public static void main(String[] args) {
		System.out.println("---------- SPIDER ---------------");
		// initialize with own reference
		Spider spider = new Spider();
		spider.eat();
		spider.walk();

		// initialize with super class reference (Animal)
		Animal spider2 = new Spider();
		spider2.eat();
		spider2.walk();

		System.out.println("---------- CAT ---------------");
		// initialize with own reference
		Cat cat = new Cat();
		cat.eat();
		cat.walk();

		// initialize with super class reference (Animal)
		Animal cat2 = new Cat();
		cat.eat();
		cat.walk();

		// initialize with interface
		IPet cat3 = new Cat();
		cat3.setName("Coffee");
		cat3.getName();
		cat3.play();

		System.out.println("---------- FISH ---------------");
		// initialize with own reference
		Fish fish = new Fish();
		fish.eat();
		fish.walk();

		// initialize with super class reference (Animal)
		Animal fish2 = new Fish();
		fish2.eat();
		fish2.walk();

		// initialize with interface
		IPet fish3 = new Fish();
		fish3.setName("Nemo");
		fish3.getName();
		fish3.play();

		System.out.println("*******************************");
		cat.setName("Garphield");
		canPlay(cat);
		canPlay(fish);
		canPlay(spider);
		
		System.out.println("*******************************");
		
		
		// polymorphish recap
		System.out.println("----------Polymorphism Recap---------");
		Cat garphield = new Cat();
		Animal animal = garphield; // implicit (upcasting)

		Animal fish4 = new Fish();
		if (fish4 instanceof Spider) {
			Spider spider3 = (Spider) fish4; // explicit (downcasting)
		} else {
			System.out.println("fish4 is NOT SPIDER !!!!");
		}

	}
	
	private static void canPlay(Animal a) {
		if(a instanceof IPet) {
			IPet p = (IPet)a;
			p.play();
		} else {
			System.out.println("Danger!!! Wild Animal !!!");
		}
	}
	
	
	
}
