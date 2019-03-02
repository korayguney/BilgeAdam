package com.bilgeadam.nestedclasseschallenge;

public class HelloWorldOuterClass {

	// member inner class
	abstract class HelloWorld {
		abstract void greetSomeone(String name);
	}
	
	public interface HelloWorldInterface {
		 void greetSomeone(String name);
	}
	
	
	public void sayHello () {
		
		// Local inner class
		class EnglishGreeting extends HelloWorld  {
			@Override
			void greetSomeone(String name) {
				System.out.println("Hello " + name);
			}
		}
		
		HelloWorld englishGreeting = new EnglishGreeting();
		englishGreeting.greetSomeone("Erkan");
		
		// Anonymous inner class
		HelloWorld frenchGreeting = new HelloWorld() {
			@Override
			void greetSomeone(String name) {
				System.out.println("Salut " + name);
			}
		};
		
		frenchGreeting.greetSomeone("Anýl");
		
		// Anonymous inner class
		HelloWorldInterface turkishGreeting = new HelloWorldInterface () {

			@Override
			public void greetSomeone(String name) {
				System.out.println("Merhaba " + name);
			}
		};
		
		turkishGreeting.greetSomeone("Gökhan");
	}
	
	public static void main(String[] args) {
		new HelloWorldOuterClass().sayHello();
	}
	
}
