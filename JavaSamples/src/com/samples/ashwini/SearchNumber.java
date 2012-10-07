package com.samples.ashwini;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class SearchNumber{
 
 

public  void main(String[] args) {
				
	  ArrayList<String> arrayList = new ArrayList<String>();
	  String strings[] = new String[10];
	  
	    //Add elements to Arraylist using
	    arrayList.add("1");
	    arrayList.add("2");
	    arrayList.add("3");
	 arrayList.add("4");
	    //To get size of Java ArrayList use int size() method
	    int totalElements = arrayList.size();
	   
	    System.out.println("ArrayList contains...");
	    //loop through it
	  
		for(int index=0; index < totalElements; index++)
	    	strings[index] = String.valueOf(index);
		int index=0;
		arrayList.add(String.valueOf(index));
	      System.out.println(arrayList.get(index));
	
  
  try{
  BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter number : ");
  int num = Integer.parseInt(br1.readLine());
  System.out.println("Enter Numbers:"+num);
  }catch(Exception e)
  {
	  
  }
  
  boolean exists = arrayList.contains("num");
System.out.println("Containes "+exists);
}
}
  