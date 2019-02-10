package com.bilgeadam.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<>();
		array.add("Yıldız");
		array.add("Kübra");
		array.add("Melis");
		array.add("Anıl");
		array.add("Erkan");
		array.add("Gökhan");
		array.add("Koray");
		array.set(3, "Mustafa");

		for(int i=0; i< array.size(); i++) {
			System.out.println((i+1)+". student :"+ array.get(i));
		}
		
		//System.out.println(array.isEmpty());
		array.set(6, "Umut");
		System.out.println("*********************************");
		for(int i=0; i< array.size(); i++) {
			System.out.println((i+1)+". student :"+ array.get(i));
		}
		
		System.out.println(array.indexOf("Anıl"));
		array.remove(6);
		System.out.println("*********************************");
		for(int i=0; i< array.size(); i++) {
			System.out.println((i+1)+". student :"+ array.get(i));
		}
		
		List<String> array2 = array.subList(0, 3);
		System.out.println("Inside sublist");
		for (int i = 0; i < array2.size(); i++) {
			System.out.println(array2.get(i));
		}
		
	}
	
}
