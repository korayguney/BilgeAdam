package com.bilgeadam.mapExample;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> myMap = new TreeMap<>();
		
		myMap.put("Fenerbahçe", 25);
		myMap.put("Galatasaray", 37);
		myMap.put("Beþiktaþ", 35);
		myMap.put("Trabzonspor", 30);
		myMap.put("Baþakþehir", 42);
		myMap.put("Baþakþehir", 1000);
		
//		int point = myMap.get("Fenerbahçe");
//		System.out.println("Point of Fenerbahçe " + point);
		
		
//		for (Integer integer : myMap.values()) {
//			System.out.println(integer);
//		}
		
//		Set<String> keys = myMap.keySet();
//		keys.forEach(k -> System.out.println(k));
		
		for (Entry<String, Integer> entry : myMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}

}
