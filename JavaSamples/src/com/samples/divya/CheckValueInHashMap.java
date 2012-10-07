package com.samples.divya;
import java.util.HashMap;

public class CheckValueInHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		HashMap hMap = new HashMap();//HashMap object created;
		
		    hMap.put("1","One");//adding values into HashMap
		    hMap.put("2","Two");
		    hMap.put("3","Three");
		   
		    boolean bExists = hMap.containsValue("Three");// checking if the value exist using Boolen method
		    System.out.println("Three exists in HashMap ? : " + bExists);
	}

}
