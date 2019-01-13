package com.bilgeadam.setterconstructorrelation;

class SuperClass {

	public SuperClass() {
		doLogic();
	}

	void doLogic() {
		System.out.println("This is Super Class!!!");
	}

}

class SubClass extends SuperClass {
	private String color;

	public SubClass() {
		super();
		this.color = "Red";
	}

	@Override
	void doLogic() {
		System.out.println("The color of the subclass is " + color);
	}

}

public class DoNotCallSetterFromConstructor {

	public static void main(String[] args) {

		SuperClass superClass = new SuperClass(); // This is Super Class!!!
		SuperClass subclass = new SubClass();
		
	}
}
