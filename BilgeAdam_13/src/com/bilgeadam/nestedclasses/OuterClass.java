package com.bilgeadam.nestedclasses;

public class OuterClass {

	// static inner (nested) class
	private static class StaticInnerClass {
		public static void printInfo() {
			System.out.println("In the static nested class");
		}
	}
	
	// member (instance) inner (nested) class
	protected class MemberInnerClass {
		public void printInfo() {
			System.out.println("In the member nested class");
		}
	}
	
	public void printInfoOfLocalClass(int a) {
		// local inner (nested) class
		class LocalInnerClass {
			public void printInfo() {
				System.out.println("In the local nested class" + a);
			}
		}
		
		LocalInnerClass localInnerClass = new LocalInnerClass();
		localInnerClass.printInfo();
	}
	
	
	
	
	public static void main(String[] args) {
		
		// static inner (nested) class
		StaticInnerClass.printInfo();

		// member (instance) inner (nested) class
//		MemberInnerClass memberInnerClass = outerClass.new MemberInnerClass();
		OuterClass.MemberInnerClass memberInnerClass = new OuterClass().new MemberInnerClass();
		memberInnerClass.printInfo();
		
		// local inner (nested) class
		OuterClass outerClass = new OuterClass();
		outerClass.printInfoOfLocalClass(2);
	}
	
	
	
}
