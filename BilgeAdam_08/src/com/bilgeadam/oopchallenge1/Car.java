package com.bilgeadam.oopchallenge1;

public class Car {
	
	// variables
	private Engine engine; // aggregation
	private GearType gearType;
	private String color;
	private int capacity;
	
	// consructor
	public Car(Engine engine, GearType gearType, String color, int capacity) {
		super();
		this.engine = engine;
		this.gearType = gearType;
		this.color = color;
		this.capacity = capacity;
	}


	
	// getter & setter (accessor & modifier)
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public GearType getGearType() {
		return gearType;
	}

	public void setGearType(GearType gearType) {
		this.gearType = gearType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	@Override
	public String toString() {
		return String.format("Car engine : %s , gear type : %s , capacity : %d " , getEngine(), getGearType(), getCapacity());
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (engine.getSerialNumber() == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.getSerialNumber().equals(other.engine.getSerialNumber()))
			return false;
		return true;
	}

}
