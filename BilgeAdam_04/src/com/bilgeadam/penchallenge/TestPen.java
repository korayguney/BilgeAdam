package com.bilgeadam.penchallenge;

public class TestPen {

	
	public static void main(String[] args) {
		
		Pen pen = new Pen();
		
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle.getColor());
		rectangle.setHeight(100);
		rectangle.setWeight(200);
		
		Circle circle = new Circle();
		System.out.println(circle.getColor());
		circle.setRadius(25);
		
		pen.draw(rectangle);
		pen.draw(circle);
		
		pen.changecolor("Yellow", rectangle);
		pen.changecolor("Black", circle);
		
	}
}
