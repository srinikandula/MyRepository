package com.examples.srini;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
	public static void main(String[] args) throws InterruptedException, ParseException {
		Date d = new Date();
		Date d2 = new Date();
		System.out.println("d = "+ d);
		Thread.sleep(1000);
		Date d1 = new Date();
		System.out.println("d1 = "+d1);
		System.out.println("d2 ="+d1);
		System.out.println("d.after(d1) "+d.after(d1));
		System.out.println(" d.before(d1) "+d.before(d1));
		System.out.println("d.compareTo(d2) "+ d.compareTo(d2));
		System.out.println("d.compareTo(d1) "+ d.compareTo(d1));
		System.out.println("d1.compareTo(d) "+ d1.compareTo(d));
			
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(Calendar.SUNDAY);
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY);
		calendar.set(Calendar.DATE, 12);
		System.out.println(calendar.getTime());
		
	}
}
