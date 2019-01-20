package com.bilgeadam.constuctionapp;

public class Floor {

	private int floorNo;
	private Flat[] flats;
	
	public Floor(int floorNo, Flat[] flats) {
		super();
		this.floorNo = floorNo;
		this.flats = flats;
	}
	
	public String getInfo() {
		String retval = String.format("\nFloor : no: %d ", floorNo);
		for (Flat flat : flats) {
			retval += flat.getInfo();
		}
		return retval;
	}
	
	public int getPrice() {
		int total = 0;
		for (Flat flat : flats) {
			total += flat.getPrice();
		}
		return total;
	}
	

	public int getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}

	public Flat[] getFlats() {
		return flats;
	}

	public void setFlats(Flat[] flats) {
		this.flats = flats;
	}
	
	
	
	
	
}
