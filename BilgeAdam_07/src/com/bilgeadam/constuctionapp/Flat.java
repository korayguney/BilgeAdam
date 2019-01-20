package com.bilgeadam.constuctionapp;

public class Flat {

	private int no;
	private FlatType flatType;
	private int numOfRooms;
	
	public Flat(int no, FlatType flatType, int numOfRooms) {
		super();
		this.no = no;
		this.flatType = flatType;
		this.numOfRooms = numOfRooms;
	}
	
	public String getInfo() {
		return String.format("\n\tFlat: no: %d , type: %s" , no, flatType.toString());
	}
	
	public int getPrice() {
		return flatType.getPrice();
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public FlatType getFlatType() {
		return flatType;
	}
	public void setFlatType(FlatType flatType) {
		this.flatType = flatType;
	}
	public int getNumOfRooms() {
		return numOfRooms;
	}
	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}
	
	
	
	
}
