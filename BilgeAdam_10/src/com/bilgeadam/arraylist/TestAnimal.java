package com.bilgeadam.arraylist;

import java.util.ArrayList;

public class TestAnimal {

	private static ArrayList<Animal> animals = new ArrayList<>();

	public static void main(String[] args) {

		Animal animal1 = new Animal();
		animal1.setAge(5);
		animal1.setName("Dog");

		Animal animal2 = new Animal();
		animal2.setAge(67);
		animal2.setName("Turtle");

		animals.add(animal1);
		animals.add(animal2);

		
//		Animal animal3 = animal1;
//		animal3.setName("Wolf");
		
		
		Animal animal4 = new Animal();
		animal4.setName("Mouse");
		animals.set(0, animal4);
		
		System.out.println("Is removed ? " +animals.remove(animal4));;
		
		for (Animal animal : animals) {
			System.out.println(animal.getName());
		}
		
		System.out.println(animals.size());
		System.out.println(animals.get(0).getName());
	}
}

class Animal {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
