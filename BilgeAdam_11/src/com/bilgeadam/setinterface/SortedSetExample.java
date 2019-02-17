package com.bilgeadam.setinterface;

import java.util.Set;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		
		Set<Integer> intSet = new TreeSet<>();
		intSet.add(12);
		intSet.add(24);
		intSet.add(41);
		intSet.add(7);
		intSet.add(187);
		intSet.add(0);
		
		for (Integer integer : intSet) {
			System.out.println(integer);
		}
		
		
		
		
		
	}

}
