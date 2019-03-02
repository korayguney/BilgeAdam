package com.bilgeadam.nestedclasses;

public class AnonymousInnerClassExample {

	// member inner class 
	public interface InnerInterface {
		public void sayHello(String name);
	}
	
	public void greetSomeone (String name, InnerInterface inner) {
		inner.sayHello(name);
	}
	
	public static void main(String[] args) {
		
		AnonymousInnerClassExample example = new AnonymousInnerClassExample();
		
		// Anonymous inner (nested) class
//		example.greetSomeone("Melis", new InnerInterface() {
//			
//			@Override
//			public void sayHello(String name) {
//				System.out.println("Hello " + name);
//			}
//		});
		
		example.greetSomeone("Ali", new AnonymousInnerClassExample().new InnerInterfaceImpl());
	}
	
	
	private class InnerInterfaceImpl implements InnerInterface {

		@Override
		public void sayHello(String name) {
			System.out.println("Hola " + name);
		}
		
	}
	
	
	
}
