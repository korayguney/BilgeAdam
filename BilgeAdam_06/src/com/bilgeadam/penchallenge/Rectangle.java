package com.bilgeadam.penchallenge;

public class Rectangle extends Shape {

	private int weight;
	private int height;

//	public Rectangle() {
//		this.color = "Red";
//		// TODO Auto-generated constructor stub
//	}

	public Rectangle(String color) {
		super(color);
	}

	public Rectangle(int weight, int height, String color) {
		super(color);
		this.weight = weight;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Area of the rectangle : " + this.getHeight() * this.getWeight());
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
