package com.bilgeadam.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class TestCarArray {

	public static void main(String[] args) {

		Car car1 = new Car(2018, "Fiat Egea", 78500.00);
		Car car2 = new Car(2017, "Renault Clio", 65250.00);
		Car car3 = new Car(2015, "Citroen DS4", 98450.25);
		Car car4 = new Car(2019, "Tata Indigo", 45892.50);
		Car car5 = new Car(2013, "Ferrari Spidr", 345898.50);
		Car car6 = new Car(2013, "Ferrari Spidr", 345898.50);
		
		Car[] cars = new Car[5];
		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;
		cars[3] = car4;
		cars[4] = car5;
		
		ArrayList<Car> carsArray = new ArrayList<>(Arrays.asList(cars));
		carsArray.add(car6);
		for (Car car : carsArray) {
			System.out.println(car);
		}
		
//		List<Car> carArray = Arrays.asList(cars);
//		for (Car car : carArray) {
//			System.out.println(car);
//		}
//		
//		carArray.add(car6);
		
//		ArrayList<Car> cars = new ArrayList<>();
//		cars.add(car1);
//		cars.add(car2);
//		cars.add(car3);
//		cars.add(car4);
//		cars.add(car5);
//		
//		System.out.println("------ For loop--------");
//		for (int i = 0; i < cars.size(); i++) {
//			System.out.println(cars.get(i));
//		}
//		
//		System.out.println("------ Enhanced For loop--------");
//		for (Car car : cars) {
//			System.out.println(car);
//		}
//		
//		System.out.println("------ While  loop--------");
//		int i=0;
//		while(i < cars.size()) {
//			System.out.println(cars.get(i));
//			i++;
//		}
//		
//		System.out.println("------ While  loop--------");
//		Iterator<Car> carIterator =  cars.iterator();
//		while(carIterator.hasNext()) {
//			System.out.println(carIterator.next());
//		}
//		
//		System.out.println("------ For each  loop--------");
//		cars.forEach(new Consumer<Car>() {
//
//			@Override
//			public void accept(Car car) {
//				System.out.println(car);
//			}
//		});
//		
//		System.out.println("------ For each  loop lambda--------");
//		cars.forEach(car -> System.out.println(car));
//		
	}

}
