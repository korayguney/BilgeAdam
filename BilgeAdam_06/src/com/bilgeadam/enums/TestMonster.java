package com.bilgeadam.enums;

import java.time.DayOfWeek;
import java.time.Month;

public class TestMonster {

	public static void main(String[] args) {

		Monster monster = Monster.FIRE_MONSTER;

		if (monster == Monster.FIRE_MONSTER) {
			System.out.println("This is Fire Monster");
		} else if (monster == Monster.STONE_MONSTER) {
			System.out.println("This is Stone Monster");
		} else if (monster == Monster.WATER_MONSTER) {
			System.out.println("This is Water Monster");
	
		}

		System.out.println("*******************************");
		
		switch (monster) {
		case FIRE_MONSTER:
			System.out.println("This is Fire Monster !");
			break;
		case WATER_MONSTER:
			System.out.println("This is Water Monster !");
			break;
		case STONE_MONSTER:
			System.out.println("This is Stone Monster !");
		default:
			System.out.println("Unknown monster");
			break;
		}
		System.out.println("*******************************");
		
		Monster[] monsters =  monster.values();
		for (Monster monster2 : monsters) {
			System.out.println(monster2);
			System.out.println(monster2.getMonster_init());
		}
		
		System.out.println("*******************************");
		// calculate total power of monsters;
		
		Monster[] monsters2 = {Monster.FIRE_MONSTER , Monster.WATER_MONSTER, Monster.STONE_MONSTER};
		int sumOfPower = 0;
		
		for (Monster monster2 : monsters2) {
			System.out.println(monster2.toString() + " has " + monster2.getPower_of_monster() + " Power...");
			sumOfPower += monster2.getPower_of_monster();
		}
		
		System.out.println("Total power of the monster is : " + sumOfPower);
		
		System.out.println("*******************************");
		DayOfWeek [] dayOfWeeks = DayOfWeek.values();
		
		for (int i = 0; i < dayOfWeeks.length; i++) {
			System.out.println(i+1+" day of the week: " + dayOfWeeks[i]);
		}
		
		System.out.println("*******************************");
		Month [] months = Month.values();
		
		for (int i = 0; i < months.length; i++) {
			System.out.println(i+1+" month of the year: " + months[i]);
		}
		
	}

}
