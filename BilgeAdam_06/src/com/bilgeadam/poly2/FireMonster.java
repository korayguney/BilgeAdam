package com.bilgeadam.poly2;

public class FireMonster extends Monster{

	public FireMonster(String name) {
		super(name);
	}
		
	@Override
	public void attack() {
		System.out.println("Attack with fire !");
	}
	
}
