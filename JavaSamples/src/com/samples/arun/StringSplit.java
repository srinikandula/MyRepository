package com.samples.arun;

public class StringSplit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = " this is cool";
		String[] str1;
		str1 = str.split(" ");
		for (int i = str1.length - 1; i >= 0; i--) {

			System.out.println(str1[i]);
		}
	}
	
	
}
