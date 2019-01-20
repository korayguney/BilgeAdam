package com.bilgedam.interfacechallenge;

public class TestMove {
	
	public static void main(String[] args) {
		
		MovablePoint point = new MovablePoint(0, 0);
		point.moveUp();
		point.moveUp();
		point.moveUp();
		point.moveRight();
		point.moveRight();
		point.moveDown();
		point.moveRight();
		point.moveLeft();
		point.moveLeft();
		point.moveLeft();
		point.moveDown();
	
		long test = 1252_4521_5125_4361L;
		System.out.println(test);
		
	}

	@Override
	protected void finalize() throws Throwable {
		// write your own resource planning
	}
	
}
