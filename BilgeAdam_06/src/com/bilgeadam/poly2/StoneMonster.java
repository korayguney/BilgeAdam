package com.bilgeadam.poly2;

public class StoneMonster extends Monster{

	public StoneMonster(String name) {
		super(name);
	}
		
	@Override
	public void attack() {
		System.out.println("Attack with stone !");
	}
	
}
