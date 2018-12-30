package com.bilgeadam.strings;

public class MutableStrings {

	public static void main(String[] args) {

		StringBuffer name1 = new StringBuffer("Mustafa");
		StringBuffer name2 = new StringBuffer("Mustafa");
//		System.out.println(name1);
//		System.out.println(name2);
		
		// check string equality
		if (name1.toString().equals(name2.toString())) {
			System.out.println("name 1 and name2 is EQUAL");
		} else {
			System.out.println("name 1 and name2 is NOT EQUAL");
		}

		// check string memory points (in the heap [common poll])
		if (name1 == name2) {
			System.out.println("name 1 and name2 refers IDENTICAL memory address");
		} else {
			System.out.println("name 1 and name2 DOESN'T refer IDENTICAL memory address");
		}
		
		System.out.println(name1.append(" Kemal Atatürk").toString());;
		System.out.println(name1.capacity());
		name1.delete(0, 7);
		System.out.println(name1.toString());

		System.out.println(name1.reverse());;
		
		
		
		
		
	}
}
