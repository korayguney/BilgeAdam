package com.bilgeadam.arraylist;

public class Car {

	private int modelYear;
	private String name;
	private double price;
	
	public Car(int modelYear, String name, double price) {
		super();
		this.modelYear = modelYear;
		this.name = name;
		this.price = price;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [modelYear=" + modelYear + ", name=" + name + ", price=" + price + "]";
	}
	
}
