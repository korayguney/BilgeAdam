package com.bilgeadam.flighthomework;

import java.util.ArrayList;

public class Flight {

	private String destination;
	private String departure;
	private ArrayList<Pilot> pilots;
	private Plane plane;

	public Flight(String destination, String departure, ArrayList<Pilot> pilots, Plane plane) {
		super();
		this.destination = destination;
		this.departure = departure;
		this.pilots = pilots;
		this.plane = plane;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public ArrayList<Pilot> getPilots() {
		return pilots;
	}

	public void setPilots(ArrayList<Pilot> pilots) {
		this.pilots = pilots;
	}

	public Plane getPlane() {
		return plane;
	}

	public void setPlane(Plane plane) {
		this.plane = plane;
	}

	public String displayInformation() {
		String returnedDispalyMessage = "";
		for (Pilot pilot : pilots) {
			returnedDispalyMessage += "\n" + pilot.displayInformation();
		}
		return String.format("Flight : destination: %s , departure: %s , plane: %s , pilots: %s", getDestination(),
				getDeparture(), getPlane().displayInformation(), returnedDispalyMessage);
	}

}
