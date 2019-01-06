package com.bilgeadam.inheritancechallenge;

public class TestCylinder {

	public static void main(String[] args) {

		Cylinder cylinder1 = new Cylinder();
		System.out.println("Cylinder radius : " + cylinder1.getRadius() + ",color : " + cylinder1.getColor()
				+ ", height: " + cylinder1.getHeight() + ", base area : " + cylinder1.getArea() + ", volume : "
				+ cylinder1.getVolume());

		Cylinder cylinder2 = new Cylinder(5.0, 2.0);
		System.out.println("Cylinder radius : " + cylinder2.getRadius() + ",color : " + cylinder2.getColor()
				+ ", height: " + cylinder2.getHeight() + ", base area : " + cylinder2.getArea() + ", volume : "
				+ cylinder2.getVolume());

	}

}
