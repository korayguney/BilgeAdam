package com.bilgeadam.collectionsrecap;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.function.Consumer;

public class LinkedListExample {

	// static StringBuilder[] strbldArr = new StringBuilder[] {new
	// StringBuilder("Fenerbahçe"), new StringBuilder("Galatasaray"), new
	// StringBuilder("Beþiktaþ")};
	// static LinkedList<StringBuilder> linkedlist = new
	// LinkedList<>(Arrays.asList(strbldArr));
	static LinkedList<StringBuilder> linkedlist = new LinkedList<>();

	public static void main(String[] args) {

//	for (StringBuilder string : linkedlist) {
//		System.out.println(string);
//	}

		for (int i = 1; i <= 5; i++) {
			linkedlist.add(new StringBuilder().append("BilgeAdam " + i));
			System.out.println(linkedlist.get(i - 1));
		}

		// with for
		System.out.println("-------- FOR ----------");
		for (int i = 0; i < linkedlist.size(); i++) {
			System.out.println(linkedlist.get(i));
		}
		
		// with for each
		System.out.println("-------- FOR EACH ----------");
		for (StringBuilder string : linkedlist) {
			System.out.println(string);
		}
		
		// with while
		System.out.println("-------- WHILE ----------");
		int x =0;
		while(x < linkedlist.size()) {
			System.out.println(linkedlist.get(x));
			x++;
		}
		
		// with iterator
		System.out.println("-------- ITERATOR ----------");
		Iterator<StringBuilder> result = linkedlist.iterator();
		while(result.hasNext()) {
			StringBuilder newResult = result.next();
			System.out.println(newResult);
		}
		
		// with listiterator
		System.out.println("-------- LIST ITERATOR ----------");
		ListIterator<StringBuilder> resultList = linkedlist.listIterator();
		while(resultList.hasNext()) {
			StringBuilder newResult = resultList.next();
			System.out.println(newResult);
		}
		
		// with foreach
		System.out.println("-------- STREAM FOR EACH ----------");
		//linkedlist.forEach(s -> System.out.println(s));
		linkedlist.forEach(new Consumer<StringBuilder>() {
			@Override
			public void accept(StringBuilder t) {
				System.out.println(t.append(" Kadýköy"));
			}
		});
		
	}

}
