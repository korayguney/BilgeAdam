package com.bilgeadam.collectionsrecap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListArrayListBenchMark {

	public static void main(String[] args) throws InterruptedException {

		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		testAddTime(linkedList);
		testGetTime(linkedList);
		testRemoveTime(linkedList);
	}

	private static void testRemoveTime(List<Integer> arrayList) {
		System.out.println("COMPARE REMOVE");
		System.out.println("===============");
		// Arraylist
		long start5 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			arrayList.remove(Integer.valueOf(i));
		}
		long result5 = System.currentTimeMillis() - start5;
		System.out.println(
				"Remove operation is completed at " + result5 + " ms. for " + arrayList.getClass().getSimpleName());
	}

	private static void testGetTime(List<Integer> arrayList) {
		// compare get
		System.out.println("COMPARE GET");
		System.out.println("===============");
		// Arraylist
		long start3 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			arrayList.get(i);
		}
		long result3 = System.currentTimeMillis() - start3;
		System.out.println(
				"Get operation is completed at " + result3 + " ms. for " + arrayList.getClass().getSimpleName());
	}

	private static void testAddTime(List<Integer> arrayList) {
		// compare add
		System.out.println("COMPARE ADD");
		System.out.println("===============");
		// Arraylist
		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			arrayList.add(i);
		}
		long result1 = System.currentTimeMillis() - start1;
		System.out.println(
				"Add operation is completed at " + result1 + " ms. for " + arrayList.getClass().getSimpleName());
	}

}
