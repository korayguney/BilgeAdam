package com.bilgeadam.flighthomework;

public enum PlaneType {

	SMALLJET(12,2500),
	LARGEJET(118,5000),
	CARGO(6,4500);
	

	private int capacity;
	private int range;
	
	private PlaneType(int capacity, int range) {
		this.capacity = capacity;
		this.range = range;
	}
	
	
	public int getCapacity() {
		return capacity;
	}

	public int getRange() {
		return range;
	}

	
	public String displayInformation() {
		
		return String.format("Type : %s , capacity: %d, range: %d", this.name(), getCapacity(), getRange() );
		
	}
	
	
}
