package com.bilgeadam.lambdaexpressionschallenge;

import java.util.ArrayList;

public class AnalyzeTool {

	public void showResult(ArrayList<String> list, String searchStr, StringAnalyzer analyzer) {

		for (String string : list) {
			if (analyzer.analyze(string, searchStr)) {
				System.out.println("Matched : " + string);
			}
		}
	}
}
