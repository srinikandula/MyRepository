package com.samples.divya;

import java.util.*;

public class MinInArray{
     public static void main(String args[])throws Exception
         {
           Scanner br = new Scanner (System.in);
           System.out.println("Enter the  no of elements");
         
           	int n = br.nextInt();
             int arr[]=new int[n];
           
             System.out.println("Enter the elements into the array:");
            
             for(int i=0;i<n;i++)
                arr[i] = br.nextInt();
                                System.out.println("Array created.......\n");
             
                int min=arr[0];
                int d=0;
                for(int j=0;j<n;j++)
                 {

                  if(min>arr[j])
                     {
                	  min=arr[j];
                      d=j;
                         }
                 }
         
                  System.out.print("Minimum no. is "+min);
                System.out.println(" for index "+d);

         }
}
