package com.bilgeadam.penchallenge;

public class Circle {
	private int radius;
	private String color;
	
	public Circle() {
		this.color = "Blue";
		// TODO Auto-generated constructor stub
	}
	
	public Circle(String color) {
		super();
		this.color = color;
	}
	
	public Circle(int radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
	

}
