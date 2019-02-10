package com.bilgeadam.flighthomework;

public class Plane {
	private long id;
	private String name;
	private int range;
	private int capacity;
	private PlaneType planeType;
	
	public Plane(long id, String name, PlaneType planeType) {
		super();
		this.id = id;
		this.name = name;
		this.range = planeType.getRange();
		this.capacity = planeType.getCapacity();
		this.planeType = planeType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public PlaneType getPlaneType() {
		return planeType;
	}

	public void setPlaneType(PlaneType planeType) {
		this.planeType = planeType;
	}
	
	public String displayInformation() {
		return String.format("Plane: name: %s, type: %s ", getName(), getPlaneType());
	}
	
	

}
