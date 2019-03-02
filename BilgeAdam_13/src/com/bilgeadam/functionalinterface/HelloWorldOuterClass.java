package com.bilgeadam.functionalinterface;

public class HelloWorldOuterClass {

	// member inner class
	abstract class HelloWorld {
		abstract void greetSomeone(String name);
	}
	
	@FunctionalInterface
	public interface HelloWorldInterface {
		 void greetSomeone(String name);
	}
	
	@FunctionalInterface
	public interface HelloWorldInterface2 {
		 void greetSomeone();
	}
	
	public void sayHello () {
		
			
		// Anonymous inner class
//		HelloWorld frenchGreeting = new HelloWorld() {
//			@Override
//			void greetSomeone(String name) {
//				System.out.println("Salut " + name);
//			}
//		};
		
		// Anonymous inner class
		HelloWorldInterface frenchGreeting = name -> System.out.println("Salut " + name);
		
		frenchGreeting.greetSomeone("Anýl");
		
		// Anonymous inner class
//		HelloWorldInterface turkishGreeting = new HelloWorldInterface () {
//
//			@Override
//			public void greetSomeone(String name) {
//				System.out.println("Merhaba " + name);
//			}
//		};
		
		HelloWorldInterface turkishGreeting2 = name -> System.out.println("Merhaba " + name);
		
		HelloWorldInterface turkishGreeting = (String name) -> System.out.println("Merhaba " + name);
		
		HelloWorldInterface2 funcTest = () -> System.out.println("In the empty functional interface method");
		
		turkishGreeting.greetSomeone("Gökhan");
		funcTest.greetSomeone();
	}
	
	public static void main(String[] args) {
		new HelloWorldOuterClass().sayHello();
	}
	
}
