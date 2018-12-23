package com.bilgeadam.strings;

public class StringMain {
	//static String test1 ="We are humans";
	public static void main(String[] args) {
		
		String test1 = "We are humans";
		String test2 = test1; //"We are humans";
		
		
		
		
		//String test1;//new String("We are humans");
		//String test2 = new String("We are humans");
		
		//System.out.println("String 1: " + test1 + ", String 2: " + test2);
		
		//test1 = "We are NOT humans";
		
	//	System.out.println("String 1: " + test1 + ", String 2: " + test2);
		
//		if(test1.equals(test2)) {
//			System.out.println("Test 1 and test 2 is EQUAL");
//		}
//		else
//		{
//			System.out.println("Test 1 and test 2 is NOT EQUAL");
//		}
//		
		
//		System.out.println(test1.substring(0, 6));
//		System.out.println(test1.length());
//		System.out.println(test1.endsWith("mans"));
//		System.out.println(test1.indexOf("are"));
//		System.out.println(test1.substring(5));
//		char[] result = test1.toCharArray();
//		for (char c : result) {
//			System.out.println(c);
//		}
//		System.out.println(test1.startsWith("We"));
//		System.out.println(test1.compareTo("bilge Adam"));;
//		System.out.println(test1.concat(" and will be humans until forever"));;
		
		
			boolean result = test1.isEmpty();
			System.out.println(result);
		
		System.out.println(test1.toUpperCase());;
		
		
		
		
	}

}
