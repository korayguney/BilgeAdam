package com.bilgeadam.constuctionapp;

public class Building {
	
	private Address address;
	private Floor[] floors;
	
	public Building(Address address, Floor[] floors) {
		super();
		this.address = address;
		this.floors = floors;
	}

	public String getInfo() {
		String retval = String.format("Building : address: %s \n", address.getInfo());
		for (Floor floor : floors) {
			retval += floor.getInfo();
		}
		return retval;
	}
	
	public int getPrice() {
		int total = 100000;
		for (Floor floor : floors) {
			total += floor.getPrice();
		}
		return total;
	}
	 
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Floor[] getFloors() {
		return floors;
	}

	public void setFloors(Floor[] floors) {
		this.floors = floors;
	}
	
	
	
	

}
