package com.bilgeadam.serializable;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = 2L;
	private transient String name;
	private String lastname;
	private int age;
	private long citizen_number;
	
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
	

}
