package com.bilgeadam.constuctionapp;

public class BuildingBuilder {

	 public static void main(String[] args) {

		// Ground floor

		Flat studio1 = new Flat(1, FlatType.STUDIO, 1);
		Flat studio2 = new Flat(2, FlatType.STUDIO, 1);
		Flat studio3 = new Flat(3, FlatType.STUDIO, 1);
		Flat studio4 = new Flat(4, FlatType.STUDIO, 1);
		Flat studio5 = new Flat(5, FlatType.STUDIO, 1);

		Flat[] groundfloorflats = { studio1, studio2, studio3, studio4, studio5 };

		Floor groundfloor = new Floor(0, groundfloorflats);

		// first floor

		Flat apartment1 = new Flat(6, FlatType.APARTMENT, 3);
		Flat apartment2 = new Flat(7, FlatType.APARTMENT, 3);
		Flat apartment3 = new Flat(8, FlatType.APARTMENT, 3);

		Flat[] firstfloorflats = { apartment1, apartment2, apartment3 };

		Floor firstfloor = new Floor(1, firstfloorflats);

		// second floor

		Flat residance1 = new Flat(9, FlatType.REZIDENCE, 5);
		Flat residance2 = new Flat(10, FlatType.REZIDENCE, 5);

		Flat[] secondfloorflats = { residance1, residance2 };

		Floor secondfloor = new Floor(2, secondfloorflats);

		// build building

		Address address = new Address("Baðdat Cad.", 23);
		Floor[] floors = { groundfloor, firstfloor, secondfloor };
		Building guneyogluPlaza = new Building(address, floors);

		// print price and info

		System.out.println(guneyogluPlaza.getInfo());
		System.out.println("---------------------------------");
		System.out.println("Total Price : " + guneyogluPlaza.getPrice());

	}

}
