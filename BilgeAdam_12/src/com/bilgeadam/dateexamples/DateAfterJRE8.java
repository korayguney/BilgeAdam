package com.bilgeadam.dateexamples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateAfterJRE8 {

	public static void main(String[] args) {

		LocalDate currentdate = LocalDate.now(); 
		System.out.println(currentdate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
		
		System.out.println(currentdate.format(DateTimeFormatter.ofPattern("dd/MM/YY  , E")));
		System.out.println(currentTime.format(DateTimeFormatter.ofPattern("HH:mm ")));
		
		LocalDate definedDate = LocalDate.of(2020, Month.MARCH, 28);
		System.out.println(definedDate);
		
		System.out.println("Is leap year : " + definedDate.isLeapYear());;
		LocalDate plusDate = definedDate.plusDays(-25);
		System.out.println(plusDate);

		LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("US/Alaska"));
		System.out.println(localDateTime);
		
	}

}
