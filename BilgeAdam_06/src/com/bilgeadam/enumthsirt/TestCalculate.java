package com.bilgeadam.enumthsirt;

import com.bilgeadam.enumthsirt.Tshirt.Size;

public class TestCalculate {

	public static void main(String[] args) {

		Tshirt tshirt1 = new Tshirt(Size.LARGE);
		Tshirt tshirt2 = new Tshirt(Size.MEDIUM);
		Tshirt tshirt3 = new Tshirt(Size.XSMALL);
		Tshirt tshirt4 = new Tshirt(Size.XLARGE);
		
		Tshirt[] tshirts = new Tshirt[4];
		tshirts[0] = tshirt1;
		tshirts[1] = tshirt2;
		tshirts[2] = tshirt3;
		tshirts[3] = tshirt4;
		
		double calculateSum = 0.0;
		
		for (Tshirt tshirt : tshirts) {
			System.out.println("Price is " +PriceCalculator.calculateCost(tshirt.getSize()));
			calculateSum += PriceCalculator.calculateCost(tshirt.getSize());
		}
		
		System.out.println("Total cost of the tshirts is " + calculateSum);
		
		
	}

}
