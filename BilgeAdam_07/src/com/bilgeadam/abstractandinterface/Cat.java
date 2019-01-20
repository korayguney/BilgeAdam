package com.bilgeadam.abstractandinterface;

public class Cat extends Animal implements IPet{

	private String name;
	
	protected Cat() {
		super(4);
	}

	protected Cat(String name) {
		super(4);
		this.name = name;
	}
	
	@Override
	public void eat() {
		System.out.println("Cats eat mouse and Royal Canin");
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println("Cat " +  getName() +" plays...");
	}
	
}
