package com.bilgeadam.penchallenge;

public class TestPen {

	
	public static void main(String[] args) {
		
		Pen pen = new Pen();
		
		Rectangle rectangle = new Rectangle("Black");
//		System.out.println(rectangle.getColor());
		rectangle.setHeight(100);
		rectangle.setWeight(200);
		
		Circle circle = new Circle("Turkish Blue");
//		System.out.println(circle.getColor());
		circle.setRadius(25);
		
		pen.draw(rectangle);
		pen.draw(circle);
		
		pen.changeColor( rectangle, "Yellow");
		pen.changeColor( circle, "Black");
		
	}
}
