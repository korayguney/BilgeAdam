package com.bilgeadam.setinterface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		//Set<String> setExample = new LinkedHashSet<>(); // get elements with inserted order
		Set<String> setExample = new TreeSet<>(); // get elements with comparable order
		//Set<String> setExample = new HashSet<>(); // get elements with complex order
		 
		setExample.add("Bilge");
		setExample.add("Adam");
		setExample.add("Kadýköy");
		setExample.add("Istanbul");
		setExample.add("Ankara");
		setExample.add("Fenerbahçe");
		setExample.add("Izmir");
		setExample.add("Izmir");
		setExample.add("Izmir");
		setExample.add("Izmir");
		setExample.add("Istanbul");
		setExample.add(null);
		setExample.add(null);
		setExample.add(null);
		setExample.add(null);
		setExample.add(null);
		
		
		System.out.println("SIZE : " + setExample.size());
		
		Iterator<String> strArrIterator = setExample.iterator();
		while(strArrIterator.hasNext()) {
			System.out.println(strArrIterator.next());
		}
		
		
//		for (String string : setExample) {
//			System.out.println(string);
//		}
		
		
		
		
		
	}

}
