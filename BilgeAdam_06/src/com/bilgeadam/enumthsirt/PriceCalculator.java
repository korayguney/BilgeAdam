package com.bilgeadam.enumthsirt;

import com.bilgeadam.enumthsirt.Tshirt.Size;

public class PriceCalculator {

	public static double calculateCost(Size size) {

		switch (size) {
		case XSMALL:
			return 10.00;
		case SMALL:
			return 15.00;
		case MEDIUM:
			return 18.00;
//		case LARGE:
//			return 25.00;
//		case XLARGE:
//			return 28.00;
		default:
			return 25.00;
		}

	}
	
	
	
}
