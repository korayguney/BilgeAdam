package com.bilgeadam.polymorh;

public class TestAnimal {

	public static void main(String[] args) {
//		
		Animal animal = new Dog();
//		Dog dog = new Dog();
////		animal.makeSound();
//		
//		Animal animal2 = dog; //upcasting (implicit casting)
//		
//		dog = (Dog) animal; // downcasting (explicit casting)
//		
//		if(dog instanceof Dog) {
//			System.out.println("Yes");
//		}
//		
//		dog.makeSound();

//		Dog dog = new Dog();
//		Animal animal = dog; // implicit
//
//		animal.makeSound();

		Cat cat = new Cat();
		animal = cat;
		
		if (animal instanceof Dog)
			Dog dog2 = (Dog) animal;
		else

			animal.makeSound();

//		Dog dog2 = (Dog) animal;
//		dog2.makeSound();

	}
}
