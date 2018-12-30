package com.bilgeadam.penchallenge;

public class Rectangle {

	private int weight;
	private int height;
	private String color;
	
	public Rectangle() {
		this.color = "Red";
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(String color) {
		super();
		this.color = color;
	}

	public Rectangle(int weight, int height, String color) {
		super();
		this.weight = weight;
		this.height = height;
		this.color = color;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

	
	
	
	
	
	
}
