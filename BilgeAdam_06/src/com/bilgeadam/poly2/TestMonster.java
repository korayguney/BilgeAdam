package com.bilgeadam.poly2;

public class TestMonster {

	
	public static void main(String[] args) {
		
		Monster m1 = new StoneMonster("stone monster");
		Monster m2 = new FireMonster("fire monster");
		Monster m3 = new WaterMonster("water monster");
		
		m1.attack();
		m2.attack();
		m3.attack();
		
		// m1 dies. initialize new monster
		m1 = new FireMonster("fire monster 2"); // upcasting -- implicit casting
		m1.attack();
		
		Monster m4 = new Monster("general monster");
		m4.attack();
		
	}
}
