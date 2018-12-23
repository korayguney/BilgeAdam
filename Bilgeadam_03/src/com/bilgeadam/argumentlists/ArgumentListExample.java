package com.bilgeadam.argumentlists;

import com.sun.org.glassfish.external.statistics.AverageRangeStatistic;

public class ArgumentListExample {

	public static void main(String[] args) {
		calculateAverageOfAges(25, "Ahmet" ,  45 , 36 , 89 , 4 , 21 , 80);
	}
	
	
	public static void calculateAverageOfAges(int age, String name, int... ages) {
		double average = 0;
		average += 10;
		int increment = 0;
		int sum = 0;
		
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
			increment++;
		}
		
		average = sum / increment;
		System.out.println("Name of the teacher " + name);
		System.out.println("Number of entered ages " + increment);
		System.out.println("Total of the entered ages " + sum);
		System.out.println("Average of the ages " + average);
	}

}
