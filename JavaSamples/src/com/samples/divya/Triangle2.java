package com.samples.divya;

import java.util.*;
	
public class Triangle2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter no of rows for  triangle: ");
	   
		Scanner console=new Scanner(System.in);// manually entering the data
	    
		int number=console.nextInt();
	    
	    for (int i = 0; i < number; i++) {

	    int a = 1;
	    	 
         for(int j = 0;j < number-i; j++){
          
        	 System.out.print("   "); 
             }

         	for(int k = 0; k <= i; k++){
             
               System.out.print("   ");
                System.out.print(a); //prints the value in a 
                 
                System.out.print(" ");
                   a = a * (i - k) / (k + 1);
             }
System.out.println();
             System.out.println();
       }
       System.out.println();       
}


	    }
	    


