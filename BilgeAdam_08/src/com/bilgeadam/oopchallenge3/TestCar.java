package com.bilgeadam.oopchallenge3;

public class TestCar {

	public static void main(String[] args) {

		Engine engine1 = new Engine("AB879NY12545", 105, 1600, EngineType.HYBRID);
		//Engine engine2 = new Engine("AB879NY12545", 155, 1645, EngineType.ELECTRIC);
		Engine engine2 = new Engine("BB879NY12545", 105, 1600, EngineType.HYBRID);
		
		Car masserati1 = new Car(engine1, GearType.AUTOMATIC, "Black", 2);
		Car masserati2 = new Car(engine2, GearType.AUTOMATIC, "Black", 2);
		
		Engine boat_engine = new Engine("DASHASHDSA5855", 255, 3000, EngineType.DIESEL);
		Boat azimut = new Boat("White with Black Strips", boat_engine, GearType.AUTOMATIC);
		
//		double boatConsumeRate = azimut.calculateConsumeRate(200);
//		System.out.println("Boat consumed " + boatConsumeRate + "litres during 200 miles");
//		
//		System.out.println("Car consumed : " + masserati1.calculateConsumeRate(250)); 
//		
//		azimut.startEngine(azimut.getEngine());
//		masserati1.startEngine(masserati1.getEngine());
		
		Mechanic haydarUsta = new Mechanic();
		haydarUsta.fixVehicle((Boat)azimut);
		haydarUsta.fixVehicle(masserati1);
		
		System.out.println("Cost is " + Fixable.calculateFixCost(masserati2));;
		
		Vehicle vehicle = azimut; // implicit
		if(vehicle instanceof Boat) {
			Boat boat = (Boat)vehicle; // explicit
			System.out.println(boat);
		} else {
			System.out.println("Can not be cast...");
		}
		
		
		}
	}


