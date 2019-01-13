package com.bilgeadam.enumthsirt;

public class Tshirt {

	public enum Size {
		SMALL, MEDIUM, LARGE, XLARGE, XSMALL;
	}

	private Size size;

	public Tshirt(Size size) {
		super();
		this.size = size;
	}

	public Size getSize() {
		return size;
	}
	
	

}
