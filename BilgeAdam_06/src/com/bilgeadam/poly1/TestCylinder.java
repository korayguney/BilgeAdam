package com.bilgeadam.poly1;

import com.sun.org.apache.xml.internal.security.encryption.CipherReference;

public class TestCylinder {

	public static void main(String[] args) {

//		Cylinder cylinder1 = new Cylinder();
//		System.out.println("Cylinder radius : " + cylinder1.getRadius() + ",color : " + cylinder1.getColor()
//				+ ", height: " + cylinder1.getHeight() + ", base area : " + cylinder1.getArea() + ", volume : "
//				+ cylinder1.getVolume());
//
//		Cylinder cylinder2 = new Cylinder(5.0, 2.0);
//		System.out.println("Cylinder radius : " + cylinder2.getRadius() + ",color : " + cylinder2.getColor()
//				+ ", height: " + cylinder2.getHeight() + ", base area : " + cylinder2.getArea() + ", volume : "
//				+ cylinder2.getVolume());

		//Circle c1 = new Cylinder(1.1, 2.2); // upcasting -- implicit casting
		//System.out.println(c1.toString()); 
		
//		c1.getHeight();
//		c1.getVolume();
		
		//Cylinder cy1 =(Cylinder)c1; // downcasting -- explicit casting
		
		Circle c1 = new Circle();
		Cylinder cy1 = new Cylinder();
		
		System.out.println(cy1 instanceof Circle); //true
		System.out.println(c1 instanceof Circle); //true
		System.out.println(cy1 instanceof Cylinder); //true
		System.out.println(c1 instanceof Cylinder); //false
		
		Circle c2 = new Cylinder();
		System.out.println(c2 instanceof Circle); // true
		System.out.println(c2 instanceof Cylinder); // true
		
	}

}
