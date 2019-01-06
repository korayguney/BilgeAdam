package com.bilgeadam.aggregaitoncomposition;

public class City {

	private String name;
	private String country;
	private int traffic_plate_no;
	
	
	public City(String name, String country, int traffic_plate_no) {
		super();
		this.name = name;
		this.country = country;
		this.traffic_plate_no = traffic_plate_no;
	}


	public String getinfo() {
		return String.format("City : traffic code: %d , city name : %s , country : %s ", traffic_plate_no ,name, country);
	}
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public int getTraffic_plate_no() {
		return traffic_plate_no;
	}


	public void setTraffic_plate_no(int traffic_plate_no) {
		this.traffic_plate_no = traffic_plate_no;
	}
	
	
	
	
	
	
	
	
}
