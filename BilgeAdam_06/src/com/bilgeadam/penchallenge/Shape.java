package com.bilgeadam.penchallenge;

public class Shape {

	private String color;

	public Shape(String color) {
		this.color = color;
	}

	public void draw() {
		System.out.println("I cannot draw without knowing the exact shape!");
	}
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
