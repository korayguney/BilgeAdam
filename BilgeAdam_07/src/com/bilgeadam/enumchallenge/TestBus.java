package com.bilgeadam.enumchallenge;

public class TestBus {

	public static void main(String[] args) {
		
		Passenger passenger1 = new Passenger("Ali Veli", Destination.ANKARA);
		Passenger passenger2 = new Passenger("Fatma Veli", Destination.ISTANBUL);
		Passenger passenger3 = new Passenger("Serhat Veli", Destination.IZMIR);
		Passenger passenger4 = new Passenger("Murat Veli", Destination.ANKARA);
		Passenger passenger5 = new Passenger("Ayşe Veli", Destination.ISTANBUL);
		Passenger passenger6 = new Passenger("Koray Veli", Destination.IZMIR);
		
		Bus bus = new Bus(Destination.ANKARA);
		
		bus.insertPassenger(passenger1);
		bus.insertPassenger(passenger2);
		bus.insertPassenger(passenger3);
		bus.insertPassenger(passenger4);
		bus.insertPassenger(passenger4);
		bus.insertPassenger(passenger4);
		bus.insertPassenger(passenger4);
		bus.insertPassenger(passenger4);
		bus.insertPassenger(passenger4);
		bus.insertPassenger(passenger4);
		bus.insertPassenger(passenger4);
		bus.insertPassenger(passenger4);
		bus.insertPassenger(passenger4);
		bus.insertPassenger(passenger4);
		bus.insertPassenger(passenger4);
		bus.insertPassenger(passenger5);
		bus.insertPassenger(passenger6);
		
	}
}
