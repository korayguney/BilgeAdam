package com.bilgeadam.aggregaitoncomposition;

public class TestStudent {

	public static void main(String[] args) {
		
		
		City city1 = new City("Ankara", "Turkiye", 06);
		Address address1 = new Address(25, city1, 06370, "Karanfil Cad.");
		Student student1 = new Student(255, "John Smith", 1346667789l, address1);
		String info = student1.getinfo();
		System.out.println(info);
		System.out.println(student1.getAddress().getCity().getTraffic_plate_no());
		
		System.out.println("-------------------------------------------------");
		
		City city2 = new City("Izmir", "Turkiye", 35);
		Address address2 = new Address(258, city2, 35879, "Kıbrıs Şehitleri Cad.");
		Student student2 = new Student(894, "John Ben", 13466672329l, address2);
		String info2 = student2.getinfo();
		System.out.println(info2);
		
		System.out.println(student2.getAddress().getCity().getCountry());;
		
		
		
		
	}

}
