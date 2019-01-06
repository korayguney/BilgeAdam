package com.bilgeadam.inheritance;

public class Vehicle {

	private int size;
	private String name;
	private int speed;

	public Vehicle() {
		System.out.println("In the vehicle class");
		this.speed = 0;
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String name) {
		super();
		this.name = name;
		this.speed = 0;
		System.out.println("In the vehicle class");
	}

	public Vehicle(int size, String name) {
		super();
		this.size = size;
		this.name = name;
		this.speed = 0;
		System.out.println("In the vehicle class");
	}

	public void stop() {
		this.speed = 0;
		System.out.println("Vehicle is stopped");
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
