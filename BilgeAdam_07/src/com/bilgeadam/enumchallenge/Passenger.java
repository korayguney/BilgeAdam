package com.bilgeadam.enumchallenge;

public class Passenger {

	private String name;
	private Destination destinationOfPassenger;
	
	public Passenger(String name, Destination destination) {
		super();
		this.name = name;
		this.destinationOfPassenger = destination;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Destination getDestinationOfPassenger() {
		return destinationOfPassenger;
	}

	public void setDestinationOfPassenger(Destination destinationOfPassenger) {
		this.destinationOfPassenger = destinationOfPassenger;
	}

	@Override
	public String toString() {
		return "Passenger [name=" + name + ", destinationOfPassenger=" + destinationOfPassenger + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passenger other = (Passenger) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
}
