package com.bilgeadam.oopchallenge2;

public class Boat extends Vehicle {

	private Engine engine;
	private GearType gearType;
	
	
	public Boat(String color, Engine engine, GearType gearType) {
		super(0, color);
		this.engine = engine;
		this.gearType = gearType;
	}

	@Override
	public boolean startEngine(Engine engine) {
		System.out.println(engine.startEngine() + " and it is type is "+ engine.getEngineType());
		return true;
	}


	@Override
	public double calculateConsumeRate(int miles) {
		return (double)this.getGearType().consumeRatePerMile(this.engine.getEngineType()) * miles;
	}
	
	
	
	// getter & setter
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
		Boat other = (Boat) obj;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Boat engine : " + engine.toString() + " , gear type : " + gearType;
	}



	
	
	
}
