package com.bilgeadam.memory;

public class MemoryTest {

	public static void main(String[] args) {
		
		// primitives (pass-by-value)
		int a = 25;
		int b = a;
		
		System.out.println("a : " + a + ",b : " + b);
		
		a = 50;
		System.out.println("a : " + a + ",b : " + b);
		System.out.println("-------------------------------------------------");
		
		//Reference types (pass-by-reference)
		Car car1 = new Car();
		// shallow copy(sýð kopyalama)
		Car car2 = car1;
		car1.setName("Mercedes");
		System.out.println("Car 1 : " + car1.getName() + ",Car 2 : " + car2.getName());
		car1.setName("BMW");
		System.out.println("Car 1 : " + car1.getName() + ",Car 2 : " + car2.getName());
		System.out.println("-------------------------------------------------");
		Car car3 = null;
		
		try {
			// deep copy (derin kopyalama)
			 car3 = (Car) car1.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Car class cannot be cloned");
			e.printStackTrace();
		}
		
		System.out.println("Car 1 : " + car1.getName() + ",Car 3 : " + car3.getName());
		car1.setName("Tesla");
		System.out.println("Car 1 : " + car1.getName() + ",Car 3 : " + car3.getName());
		
	}

}
