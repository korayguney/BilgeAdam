package com.bilgeadam.memory;

public class Car implements Cloneable{

	private String name;
	private double hoursePower;
	private int seats;
	private boolean isAutomatic;
	
	public Car() {
		this("Opel", 255.85, 5, false);
	}

	
	public Car(int seats, boolean isAutomatic) {
		this.seats = seats;
		this.isAutomatic = isAutomatic;
	}

	public Car(String name, double hoursePower, int seats, boolean isAutomatic) {
		//super();
		this.name = name;
		this.hoursePower = hoursePower;
		this.seats = seats;
		this.isAutomatic = isAutomatic;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getHoursePower() {
		return hoursePower;
	}


	public void setHoursePower(double hoursePower) {
		this.hoursePower = hoursePower;
	}


	public int getSeats() {
		return seats;
	}


	public void setSeats(int seats) {
		this.seats = seats;
	}


	public boolean isAutomatic() {
		return isAutomatic;
	}


	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
}
