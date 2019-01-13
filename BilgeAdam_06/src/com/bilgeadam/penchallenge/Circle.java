package com.bilgeadam.penchallenge;

public class Circle extends Shape{
	private int radius;
	
//	public Circle() {
//		this.color = "Blue";
//		// TODO Auto-generated constructor stub
//	}
	
	public Circle(String color) {
		super(color);
	}
	
	public Circle(int radius, String color) {
		super(color);
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("Area of the circle : " + Math.PI * Math.pow(this.getRadius(), 2));
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

}
