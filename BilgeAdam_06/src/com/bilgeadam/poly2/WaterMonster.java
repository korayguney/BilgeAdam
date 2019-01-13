package com.bilgeadam.poly2;

public class WaterMonster extends Monster{

	public WaterMonster(String name) {
		super(name);
	}
		
	@Override
	public void attack() {
		System.out.println("Attack with water !");
	}
	
}
