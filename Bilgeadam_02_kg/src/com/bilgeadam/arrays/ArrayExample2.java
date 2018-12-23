package com.bilgeadam.arrays;

public class ArrayExample2 {

	public static void main(String[] args) {

//		String[] cityArr = { "Ankara", "Bursa", "Ýstanbul", "Mersin", "Adana", "Ýzmir" };
//
//		System.out.println("Lenght of city array : " + cityArr.length);
//		cityArr[2] = "Yalova";
//		
//		for (String city : cityArr) {
//			System.out.println(city);
//		}
		
		String name = "Bilge Adam";
		char[] nameArr =  name.toCharArray();
		
		for (int i = 0; i < nameArr.length; i++) {
			//if(i ==0 || i == 6)
			System.out.println(i+".index character : " + nameArr[i]);
		}
		
		if (name.endsWith("m")) {
			System.out.println("finished");
		}

	}
}
