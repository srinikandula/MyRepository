package com.samples.divya;
import java.util.*;

public class Array {
	public static void main(String[] args){

	int [] a = new int[]{7,90,89,78,5,8,12,1,0};
	{  
		System.out.println("before sorting array:"); 
		 for(int i=0; i<a.length ; i++){
			
			 System.out.println(+a[i]);
		 }
	
		 Arrays.sort(a);
	   
	    //display elements of ArrayList
	    System.out.println("Array elements after sorting are: ");
	    for(int i=0; i<a.length ; i++){
	    	
	      System.out.println(+a[i]);
	    }
	  }
	}
}