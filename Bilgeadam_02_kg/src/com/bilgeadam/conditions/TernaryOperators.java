package com.bilgeadam.conditions;

public class TernaryOperators {

	public static void main(String[] args) {

		// (condition) ? (state1) : (state2);

		String name = "Andy";
		String password = "134";

		String result = (password == "134") ? ("Welcome " + name) : ("Your password is wrong");

		System.out.println(result);

	}

}
