package com.bilgeadam.flighthomework;

import java.util.ArrayList;

public class MainFlight {
	
	public static void main(String[] args) {
		
		Pilot pilot1 = new Pilot(123, "Ahmet Kaptan", 36, 12, PilotStatus.PRIMARY);
		Pilot pilot2 = new Pilot(154, "Merve Kaptan", 29, 9, PilotStatus.SECONDARY);
		
		ArrayList<Pilot> pilots = new ArrayList<>();
		pilots.add(pilot1);
		pilots.add(pilot2);
		
		Plane plane = new Plane(545, "Boeing 737", PlaneType.LARGEJET);
		
		Flight flight = new Flight("IST", "ERC", pilots, plane);
		
		System.out.println(flight.displayInformation());
	}
}
