package com.bilgeadam.abstractandinterface;

public abstract class Animal //extends Animal2 
{

	protected int legs;
	
	
	protected Animal(int legs) {
		this.legs = legs;
	}
	
	public void walk() {
		System.out.println("This animal walks on " + this.legs + " legs");
	}
	
	protected abstract void eat();
	
}
