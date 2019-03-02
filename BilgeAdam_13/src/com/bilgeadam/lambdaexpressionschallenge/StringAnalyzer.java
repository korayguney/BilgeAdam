package com.bilgeadam.lambdaexpressionschallenge;

import java.util.ArrayList;

@FunctionalInterface
public interface StringAnalyzer {

	public boolean analyze(String target, String searchedStr);
	
}
