package com.bilgeadam.enums;

public enum Monster {
	WATER_MONSTER(1, "Water monster is created"), 
	STONE_MONSTER(2, "Stone monster is created"), 
	FIRE_MONSTER(3, "Fire monster is created");
	
	int power_of_monster;
	String monster_init;
	
	private Monster(int power, String init) {
		this.power_of_monster = power;
		this.monster_init = init;
	}
	
	public int getPower_of_monster() {
		return power_of_monster;
	}
	
	public String getMonster_init() {
		return monster_init;
	}
}
