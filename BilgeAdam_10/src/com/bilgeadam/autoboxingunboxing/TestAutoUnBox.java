package com.bilgeadam.autoboxingunboxing;

import java.util.ArrayList;

public class TestAutoUnBox {
	public static void main(String[] args) {

		String[] strArr = new String[10];
		int[] intArr= new int[20];
		
//		ArrayList<Integer> arrayInt = new ArrayList<>();
//		arrayInt.add(new Integer(25));
		 
//		ArrayList<IntClass> arrayInt = new ArrayList<>();
//		arrayInt.add(new IntClass(25));
		
		ArrayList<Integer> arrayInt2 = new ArrayList<>();
//		arrayInt2.add(25);   //(Integer.valueOf(25)); ---> autoboxing
//		int x = arrayInt2.get(0); //arrayInt2.get(0).intValue(); ---> Unboxing
//		
//		
//		for(int i=0; i< 10 ; i++) {
//			arrayInt2.add(i);
//		}
//		
//		for(int i=0; i< arrayInt2.size() ; i++) {
//			System.out.println((i+1) +" --> "+ arrayInt2.get(i));;
//		}
		
		ArrayList<Double> dblArr = new ArrayList<>();
		for (double i = 0.5; i <= 10.0; i+=0.5) {
			dblArr.add(Double.valueOf(i));
		}
		
		for (int i = 0; i < dblArr.size(); i++) {
			System.out.println((i+1) + " ---> " + dblArr.get(i));
		}
	}
}

class IntClass {
	
	private int value;

	public IntClass(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}

