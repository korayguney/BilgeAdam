package com.bilgeadam.dateexamples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateBeforeJRE8 {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		long currenttime = System.currentTimeMillis();
		System.out.println(currenttime);
		Date date2 = new Date(currenttime);
		System.out.println(date2);
		date2.setHours(10);
		
		long timeaslong = date2.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY , HH:mm:ss");
		System.out.println(sdf.format(date));
		
		Date newDate = (Date)date.clone();
		System.out.println(newDate);
		
		String result = date.compareTo(date2) > 0 ? "later then first date" : "before first date";
		System.out.println(result);
		
		String strDate = "12/10/2000 , 23:10";
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/YYYY , HH:mm");
		try {
			Date parseddate = sdf2.parse(strDate);
			System.out.println(parseddate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}

}
