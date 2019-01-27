package com.bilgeadam.oopchallenge1;

public class TestCar {

	public static void main(String[] args) {

		Engine engine1 = new Engine("AB879NY12545", 105, 1600, EngineType.HYBRID);
		//Engine engine2 = new Engine("AB879NY12545", 155, 1645, EngineType.ELECTRIC);
		Engine engine2 = new Engine("BB879NY12545", 105, 1600, EngineType.HYBRID);
		
		Car masserati1 = new Car(engine1, GearType.AUTOMATIC, "Black", 2);
		Car masserati2 = new Car(engine2, GearType.AUTOMATIC, "Black", 2);
		
		System.out.println(masserati1);
		System.out.println(engine1);
		
//		if(engine1.equals(engine2)) {
//			System.out.println("Engine is EQUAL");
//		} else if(!engine1.equals(engine2)){
//			System.out.println("Engines are NOT EQUAL");
//		}
		
		String result = (engine1.equals(engine2)) ? "Engine is EQUAL" : "Engines are NOT EQUAL" ;
		System.out.println(result);
		
		if(masserati1.equals(masserati2)) {
			System.out.println("Car is EQUAL");
		} else if(!masserati1.equals(masserati2)){
			System.out.println("Cars are NOT EQUAL");
		}
	}

}
