package com.bilgeadam.collectionsrecap;

import java.util.ArrayList;
import java.util.List;

public class CollectionsRecap {

	public static void main(String[] args) {

		List<String> listArr = new ArrayList<>();
		
		listArr.add("Bilge");
		listArr.add("Adam");
		listArr.add("Kadýköy");
		listArr.add("Ýstanbul");
		listArr.remove(2);
		listArr.set(2, "Ankara");
		String result = listArr.get(1);
		System.out.println("-->"+result);
		
		for (String str : listArr) {
			String newStr = str;
			System.out.println(newStr);
		}

		System.out.println(listArr.size());
	}

}
