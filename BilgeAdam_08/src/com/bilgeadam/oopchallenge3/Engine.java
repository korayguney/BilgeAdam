package com.bilgeadam.oopchallenge3;

public class Engine {

	// variables
	private String serialNumber;
	private int horsePower;
	private int volume;
	private EngineType engineType;
	
	// constructor
	public Engine(String serialNumber, int horsePower, int volume, EngineType engineType) {
		super();
		this.serialNumber = serialNumber;
		this.horsePower = horsePower;
		this.volume = volume;
		this.engineType = engineType;
	}

	public String startEngine() {
		return "Engine is started, serial number " + this.serialNumber;
	}
	
	
	// getter & setter
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public EngineType getEngineType() {
		return engineType;
	}

	public void setEngineType(EngineType engineType) {
		this.engineType = engineType;
	}
	
	@Override
	public String toString() {
		return String.format("Engine serial number : %s , volume : %d, type : %s" , getSerialNumber(), getVolume(), getEngineType());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((serialNumber == null) ? 0 : serialNumber.hashCode());
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
		Engine other = (Engine) obj;
		if (serialNumber == null) {
			if (other.serialNumber != null)
				return false;
		} else if (!serialNumber.equals(other.serialNumber))
			return false;
		return true;
	}
	
	
	
}
