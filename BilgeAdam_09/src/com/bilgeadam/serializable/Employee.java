package com.bilgeadam.serializable;

import java.io.Serializable;

public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 100L;
	private transient String name;
	private String lastname;
	private int age;
	private long citizen_number;
	private boolean isMAle;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getCitizen_number() {
		return citizen_number;
	}
	public void setCitizen_number(long citizen_number) {
		this.citizen_number = citizen_number;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", lastname=" + lastname + ", age=" + age + ", citizen_number="
				+ citizen_number + "]";
	}
	public boolean isMAle() {
		return isMAle;
	}
	public void setMAle(boolean isMAle) {
		this.isMAle = isMAle;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
