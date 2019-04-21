package com.bilgeadam.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	

	public Student(String name) {
		super();
		this.name = name;
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}
	
	
	
	
	

}
