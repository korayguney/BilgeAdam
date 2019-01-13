package com.bilgeadam.poly2;

public class  Monster {

	private String name;
	
	public Monster(String name) {
		this.setName(name);
	}

	public void attack () {
		System.out.println(" I don't know how to attack!!!");
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
