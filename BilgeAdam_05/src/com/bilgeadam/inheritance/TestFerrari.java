package com.bilgeadam.inheritance;

public class TestFerrari {

	public static void main(String[] args) {

		Ferrari spider1 = new Ferrari();
		Ferrari spider2 = new Ferrari();

		spider1.setManual(false);
		spider2.setManual(false);
		
		spider1.setModel_year(2018);
		spider2.setModel_year(2018);
		
		spider1.setChassis_no("25NHT67964580");
		spider2.setChassis_no("25NHT679645380");
		
		if(spider1.equals(spider2)) 
			System.out.println("these ferrari spiders are equal");
		else
			System.out.println("these ferrari spiders are NOT equal");
			
		
		// spider.setName("Ferrari Spider");
		// System.out.println(spider.getName());

//		spider.setModel_year(2018);
//		spider.getinfo();
		
//		spider.accelerate(25);
//		spider.accelerate(45);
//		spider.accelerate(40);
//		spider.accelerate(20);
//		spider.break_car(100);
//	
//		spider.break_car(45);
//	
		
//		spider.getMethodsOfFerrari();

	}

}
