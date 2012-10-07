package com.samples.divya;
 import java.util.*;
 
public class FindValueInArray {

	/**
	 * @param args
	 */
public static void main(String[] args) {
		// TODO Auto-generated method stub


int[] arrayOfInts={10,12,15,17,19,10,8,9,3,7,6};
 System.out.println("size of array"+arrayOfInts.length);
	
 int value=1;
 boolean blnFound=false;
 
 for(int i=0; i<arrayOfInts.length; i++){
	 
	 if(value == arrayOfInts[i]){
	 blnFound= true;
	  }
	if(blnFound){
		System.out.println("Element found in the array");
	}
	else {
		System.out.println("Element not found in the array");
	
	}
 }
 
 

}
}

