package com.bilgeadam.enumchallenge;

public class Bus {

	private Passenger[] passengers;
	private Destination destinationOfBus;

	private int insertedPassenger;
	private final int BUS_CAPACITY;

	public Bus(Destination destinationOfBus) {
		super();
		this.passengers = new Passenger[30];
		this.destinationOfBus = destinationOfBus;
		this.insertedPassenger = 0;
		this.BUS_CAPACITY = 10;
	}

	public void insertPassenger(Passenger passenger) {
		if (insertedPassenger < this.BUS_CAPACITY) {
			if (passenger.getDestinationOfPassenger() == this.getDestinationOfBus()) {
				passengers[insertedPassenger] = passenger;
				insertedPassenger++;
				System.out.println("--------------------------------------------------------");
				System.out.println("Passenger " + passenger.getName() + " is inserted");
				System.out.println("Total passenger : " + insertedPassenger);
				System.out.println("Remained seat : " + (this.BUS_CAPACITY - insertedPassenger));
				System.out.println("--------------------------------------------------------");
			} else {
				System.out.println("Destination of bus is " + getDestinationOfBus() + " , but " + passenger.getName()
						+ " will go to " + passenger.getDestinationOfPassenger());
			}
		} else {
			System.out.println("There is NOT enough space in bus");
		}

	}

	/*
	 * getter & setter
	 */

	public Passenger[] getPassengers() {
		return passengers;
	}

	public void setPassengers(Passenger[] passengers) {
		this.passengers = passengers;
	}

	public Destination getDestinationOfBus() {
		return destinationOfBus;
	}

	public void setDestinationOfBus(Destination destinationOfBus) {
		this.destinationOfBus = destinationOfBus;
	}

}
