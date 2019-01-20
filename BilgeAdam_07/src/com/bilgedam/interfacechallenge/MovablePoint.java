package com.bilgedam.interfacechallenge;

public class MovablePoint implements Movable{

	private int x;
	private int y;
	
	public MovablePoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public void moveUp() {
		y++;
		toString();
	}

	@Override
	public void moveDown() {
		y--;
		toString();
	}

	@Override
	public void moveRight() {
		x++;
		toString();
	}

	@Override
	public void moveLeft() {
		x--;
		toString();
	}

	@Override
	public String toString() {
		System.out.println("The current position: x ---> " + this.x + " , y ---> " + this.y);
		return "The current position: x ---> " + this.x + " , y ---> " + this.y;
	}
	
	
}
