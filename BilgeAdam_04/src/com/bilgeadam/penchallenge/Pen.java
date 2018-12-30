package com.bilgeadam.penchallenge;

public class Pen {

	public void draw(Rectangle r) {
		System.out.println("Area of the rectangle : " + r.getHeight() * r.getWeight());
	}

	public void draw(Circle c) {
		System.out.println("Area of the circle : " + Math.PI * Math.pow(c.getRadius(), 2));
	}

	public void changecolor(String color, Rectangle r) {
		r.setColor(color);
		System.out.println("Color of the rectangle is " + r.getColor());

	}

	public void changecolor(String color, Circle c) {
		c.setColor(color);
		System.out.println("Color of the circle is " + c.getColor());
	}

}
