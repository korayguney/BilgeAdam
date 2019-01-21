package com.bilgeadam.abstractandinterface;

public class Spider extends Animal {

	protected Spider() {
		super(8);
	}

	@Override
	public void eat() {
		System.out.println("Spiders eat other insects");
	}

	
}
