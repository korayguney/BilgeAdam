package com.bilgeadam.poly1;

public class Cylinder extends Circle{

	private double height;
	
	//constuctors
	public Cylinder() {
		super();
		this.height=1;
	}

	public Cylinder(double height) {
		super();
		this.height = height;
	}
	
	public Cylinder(double height, double radius) {
		super(radius);
		this.height = height;
	}
	
	public Cylinder(double height, double radius, String color) {
		super(radius, color);
		this.height = height;
	}
	
	/*
	 * calculate of the cylinder volume 
	 */
	public double getVolume() {
		return super.getArea() *  height;
	}

	@Override
	public double getArea() {
		return 2*Math.PI*getRadius()*height+ super.getArea();
	}
	
	// getter && setter
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	//tostring overriding
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cylinder [height=" + height + "]";
	}
	
	
	
	
	
	
}
