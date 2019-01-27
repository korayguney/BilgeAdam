package com.bilgeadam.oopchallenge3;

public class Car extends Vehicle implements Fixable {
	
	// variables
	private Engine engine; // aggregation
	private GearType gearType;
	private int capacity;
	
	// constructor
	public Car(Engine engine, GearType gearType, String color, int capacity) {
		super(4, color);
		this.engine = engine;
		this.gearType = gearType;
		this.capacity = capacity;
	}

	@Override
	public boolean startEngine(Engine engine) {
		System.out.println(engine.startEngine() + " and it is type is "+ engine.getEngineType());
		return true;
	}

	@Override
	public double calculateConsumeRate(int miles) {
		double consumeRate = (double)getGearType().consumeRatePerMile(getEngine().getEngineType()) * miles;
		return consumeRate;
	}
	
	@Override
	public void getFixed() {
		System.out.println("The car is fixed and the cost is " + Fixable.calculateFixCost(this));
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
