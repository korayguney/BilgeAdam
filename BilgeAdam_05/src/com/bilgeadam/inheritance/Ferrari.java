package com.bilgeadam.inheritance;

import java.lang.reflect.Method;

public class Ferrari extends Car {

	private String chassis_no;
	
	public Ferrari() {
		super(2017);
		System.out.println("In the ferrari class");
	}

	public int accelerate(int speed_rate) {
		setSpeed(getSpeed() + speed_rate);
		System.out.println(Ferrari.class.getSimpleName() + " speed is now " + getSpeed() + " km/h");

		getCurrentGear();

		return getSpeed();
	}
	
	public int break_car(int speed_rate) {
		if(getSpeed() - speed_rate > 0) {
			setSpeed(getSpeed() - speed_rate);
		} else {
			setSpeed(0);
		}
		System.out.println(Ferrari.class.getSimpleName() + " speed is now " + getSpeed() + " km/h");
		
		getCurrentGear();
		
		return getSpeed();
	}
	

	public void getinfo() {
		System.out.println("Ferrari model_year is " + getModel_year());
		super.getSize();
	}
	
	public void getMethodsOfFerrari() {
		
		Method[] methods = Ferrari.class.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());;
		}
		
	}
	
//	public int getSpeed() {
//		return speed;
//	}
//
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
	
	protected int test() {
		// TODO Auto-generated method stub
		return 3;
	}

	public String getChassis_no() {
		return chassis_no;
	}

	public void setChassis_no(String chassis_no) {
		this.chassis_no = chassis_no;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chassis_no == null) ? 0 : chassis_no.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ferrari other = (Ferrari) obj;
		if (chassis_no == null) {
			if (other.chassis_no != null)
				return false;
		} else if (!chassis_no.equals(other.chassis_no))
			return false;
		return true;
	}
	
	
	
	
	
	

}
