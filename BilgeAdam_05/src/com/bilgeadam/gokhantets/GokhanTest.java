package com.bilgeadam.gokhantets;

public class GokhanTest {
	// static int a;

	public static void main(String[] args) {

		int a = 5;
		System.out.println(a);
		Test test = returnTestClass();
		System.out.println(test.getB());
		System.out.println(test.getName());
	}

	static Test returnTestClass() {
		Test test = new Test();
		test.setB(10);
		test.setName("Koray");
		return test;
	}

}

class Test {
	private String name;
	private int b;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
