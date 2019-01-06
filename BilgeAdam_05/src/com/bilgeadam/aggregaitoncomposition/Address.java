package com.bilgeadam.aggregaitoncomposition;

public class Address {

	private int no;
	private City city;
	private int postal_code;
	private String street;
	
	public Address() {

	}
	
	public Address(int no, City city, String street) {
		super();
		this.no = no;
		this.city = city;
		this.street = street;
	}
	
	public Address(int no, City city, int postal_code, String street) {
		super();
		this.no = no;
		this.city = city;
		this.postal_code = postal_code;
		this.street = street;
	}

	public String getInfo() {
		return String.format("Address : no : %d , street : %s ,  postal code : %d , city : %s " , no, street, postal_code, city.getinfo());
	}
	
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public int getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(int postal_code) {
		this.postal_code = postal_code;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	
	
	
	
	
	
	
}
