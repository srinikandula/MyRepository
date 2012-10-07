package com.examples.srini;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExamples {
	public static void main(String[] args) throws ParseException {
		String dateString = "06.25.2012";
		String newStr = "1";
		int i = Integer.parseInt(newStr);
		SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy");
		
		System.out.println(sdf.parse(dateString));
	}

}
