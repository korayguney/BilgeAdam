package com.bilgeadam.abstractandinterface;

public class Fish extends Animal implements IPet {

	private String name;
	
	protected Fish() {
		super(0);
	}

	@Override
	public void eat() {
		System.out.println("Fish eats fish food");
	}

	@Override
	public void walk() {
		System.out.println("Fish cannot walk, just swim...");
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
		System.out.println("Fish plays...");
	}
	
	
}
