package com.samples.ashwini;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
	public static void main(String[] args) {
	
		Calendar cal1 = new GregorianCalendar();
		
		cal1.set(Calendar.MONTH, Calendar.MAY);

		System.out.println("Year: " + cal1.get(Calendar.YEAR));
		System.out.println("Month: " + cal1.get(Calendar.MONTH));
		System.out.println("Days: " + cal1.get(Calendar.DAY_OF_MONTH) + 1);

		// Format the output with leading zeros for days and month
		SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(date_format.format(cal1.getTime()));

	}
}

