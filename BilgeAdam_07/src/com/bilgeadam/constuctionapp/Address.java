package com.bilgeadam.constuctionapp;

public class Address {

	private String street;
	private int no;

	public Address(String street, int no) {
		super();
		this.street = street;
		this.no = no;
	}

	public String getInfo() {
		return String.format("Address : no: %d, street: %s", no, street);
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

}
