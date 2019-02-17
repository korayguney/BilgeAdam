package com.bilgeadam.mapExample;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CarMapExample {

	public static void main(String[] args) {

		Map<Integer, Car> myCarMap = new LinkedHashMap<Integer, Car>();

		myCarMap.put(1, new Car("Renault Clio", 95450.50));
		myCarMap.put(2, new Car("Nissan Sunny", 4450.50));
		myCarMap.put(3, new Car("Maserati Spidr", 895450.50));
		myCarMap.put(4, new Car("Citroen DS4", 195450.50));

		for (Map.Entry<Integer, Car> car : myCarMap.entrySet()) {
			System.out.println(car.getKey() + " : " + " Name: " + car.getValue().getName() + " - Price: "
					+ car.getValue().getPrice());
		}
		
		// convert to list
		List<Map.Entry<Integer, Car>> entries = new LinkedList<>(myCarMap.entrySet());
		
		// sort this list with comparator
		Collections.sort(entries, new Comparator<Map.Entry<Integer, Car>>() {

			@Override
			public int compare(Map.Entry<Integer, Car> car1, Map.Entry<Integer, Car> car2) {
				return car1.getValue().compareTo(car2.getValue());
			}
		});
		
		// assign this list values to a map
		Map<Integer, Car> sortedMap = new LinkedHashMap<Integer, Car>();
		
		for (Map.Entry<Integer, Car> entry : entries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		// iterate over map array
		for (Map.Entry<Integer, Car> entry : sortedMap.entrySet()) {
			System.out.println(entry.getValue());
		}
		
	}

}
