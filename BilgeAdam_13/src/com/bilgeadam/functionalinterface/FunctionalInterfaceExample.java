package com.bilgeadam.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceExample implements MyCustomFuncInterface{

	@Override
	public void test(int a) {
		System.out.println("My number is " + a);
	}
	
	public static void main(String[] args) {
		new FunctionalInterfaceExample().test(1000);
	}
}
