package com.bilgeadam.interfaceabstractrecap;

public class TestConcrete {

	public static void main(String[] args) {
		
		Interface1.testStaticMethod();
		System.out.println(Interface1.TEST);;
		
		Concrete concreteClass = new Concrete();
		concreteClass.testDefaultMethod();
		//System.out.println(concreteClass.TEST);
		
	}

}
