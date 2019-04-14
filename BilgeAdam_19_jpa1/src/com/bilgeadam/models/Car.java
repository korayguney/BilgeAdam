package com.bilgeadam.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int id;
	private String carbrand;
	
	@Column(length=4)
	private int modelyear;
	private double price;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String carbrand, int modelyear, double price) {
		super();
		this.carbrand = carbrand;
		this.modelyear = modelyear;
		this.price = price;
	}

	public String getCarbrand() {
		return carbrand;
	}
	public void setCarbrand(String carbrand) {
		this.carbrand = carbrand;
	}
	public int getModelyear() {
		return modelyear;
	}
	public void setModelyear(int modelyear) {
		this.modelyear = modelyear;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Car [carbrand=" + carbrand + ", modelyear=" + modelyear + ", price=" + price + "]";
	}
	
	
	
	

}
