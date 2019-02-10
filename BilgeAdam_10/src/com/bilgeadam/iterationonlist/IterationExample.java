package com.bilgeadam.iterationonlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class IterationExample {

	
	public static void main(String[] args) {
		 
		ArrayList<String> iterateArr = new ArrayList<>();
		iterateArr.add("Yýldýz");
		iterateArr.add("Kübra");
		iterateArr.add("Melis");
		iterateArr.add("Anýl");
		iterateArr.add("Erkan");
		iterateArr.add("Gökhan");
		iterateArr.add("Koray");
		
		/*
		 * Iterate over classic for
		 */
		System.out.println("------ Iterate over classic for ------");
		for (int i = 0; i < iterateArr.size(); i++) {
			System.out.println(iterateArr.get(i));
		}
		
		/*
		 * Iterate over enhanced for loop
		 */
		System.out.println("------ Iterate over enhanced for loop ------");
		for (String string : iterateArr) {
			System.out.println(string);
		}
		
		/*
		 * Iterate over while loop
		 */
		System.out.println("------ Iterate over while loop ------");
		int a =0;
		while(a < iterateArr.size()) {
			System.out.println(iterateArr.get(a));
			a++;
		}
		
		/*
		 * Iterate over Iterator
		 */
		System.out.println("------ Iterate over Iterator ------");
		Iterator<String> iterate =  iterateArr.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		
		/*
		 * Iterate over foreach
		 */
		System.out.println("------ Iterate over foreach ------");
		iterateArr.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		/*
		 * Iterate over foreach with lambda
		 */
		System.out.println("------ Iterate over foreach with lambda ------");
		iterateArr.forEach(t -> System.out.println(t));
		
	}
	
}
