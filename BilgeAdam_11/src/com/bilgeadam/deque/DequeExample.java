package com.bilgeadam.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeExample {

	public static void main(String[] args) {
		Deque<String> dequeArr = new ArrayDeque<>();
		dequeArr.push("Fenerbahçe");
		dequeArr.push("Galatasaray");
		dequeArr.push("Beþiktaþ");
		dequeArr.push("Trabzonspor");
		dequeArr.push("Baþakþehir");
		dequeArr.add("test");
		dequeArr.addFirst("First");
		dequeArr.addLast("Last");
		
		System.out.println(dequeArr.peek());
		
		System.out.println("---------------------------------");
		
		Iterator<String> iterator = dequeArr.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
