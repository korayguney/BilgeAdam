package com.bilgeadam.inheritance;

public class Car extends Vehicle {

	private int model_year;
	private int seat_no;
	private boolean isManual;

	private int currentGear;

//	public Car() {
//		super("D class");
//		System.out.println("In the car class");
//
//	}

	public Car(int model_year) {
		super("D class");
		this.model_year = model_year;
		this.currentGear = 1;
		System.out.println("In the car class");
	}

	public void changeGear(int currentGear) {
		System.out.println("Car current gear is " + currentGear);
	}

	public int getSize() {
		return 5;
	}

	public void getinfo() {
		System.out.println("Car model_year is " + this.model_year);
	}

	public int getModel_year() {
		return model_year;
	}

	public void setModel_year(int model_year) {
		this.model_year = model_year;
	}

	public int getSeat_no() {
		return seat_no;
	}

	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}

	public boolean isManual() {
		return isManual;
	}

	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}

	public void getCurrentGear() {
		if (getSpeed() == 0) {
			stop();
			changeGear(1);
		} else if (getSpeed() > 0 && getSpeed() <= 20) {
			changeGear(1);
		} else if (getSpeed() > 20 && getSpeed() <= 40) {
			changeGear(2);
		} else if (getSpeed() > 40 && getSpeed() <= 60) {
			changeGear(3);
		} else if (getSpeed() > 60 && getSpeed() <= 80) {
			changeGear(4);
		} else if (getSpeed() > 80) {
			changeGear(5);
		}
	}

	protected int test() {
		System.out.println("in the Car class");
		return 3;
	}
	
}
