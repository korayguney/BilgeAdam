package com.bilgeadam.lambdaexpressionschallenge;

import java.util.ArrayList;

public class LambdaTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Ahmet");
		list.add("Ali");
		list.add("Ayþe");
		list.add("Bekir");
		list.add("Behçet");

		String searchStr = "Be";
		String searchStr2 = "a";
		String searchStr3 = "Bekir";
		char myChar = 't';

		System.out.println("Searched string :" + searchStr);

		AnalyzeTool analyzeTool = new AnalyzeTool();

		System.out.println("===CONTAINS===");
		analyzeTool.showResult(list, searchStr, new StringAnalyzer() {

			@Override
			public boolean analyze(String target, String searchedStr) {
				return target.contains(searchStr);
			}
		});
		
		System.out.println("===CONTAINS 2===");
		analyzeTool.showResult(list, searchStr,(t, s) -> t.contains(s));
		
		System.out.println("===STARTS WITH===");
		analyzeTool.showResult(list, searchStr2, new StringAnalyzer() {
			
			@Override
			public boolean analyze(String target, String searchedStr) {
				return target.startsWith(searchStr2.toUpperCase());
			}
		});
		
		System.out.println("===STARTS WITH 2===");
		analyzeTool.showResult(list, searchStr2, (target, searchedStr) -> target.startsWith(searchStr2.toUpperCase()));
		
		System.out.println("===EQUALS===");
		analyzeTool.showResult(list, searchStr3, (t, s) -> t.equals(s));
		
		System.out.println("===ENDS WITH===");
		analyzeTool.showResult(list, String.valueOf(myChar), (t, s) -> t.endsWith(s));
		
		System.out.println("===LESS THAN 5===");
		analyzeTool.showResult(list, searchStr, (t, s) -> t.length() < 5);
		
		System.out.println("===GREATER THAN 4===");
		analyzeTool.showResult(list, searchStr, (t, s) -> t.length() > 4);
		
	}

}
