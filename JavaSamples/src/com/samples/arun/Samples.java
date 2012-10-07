package com.samples.arun;

public class Samples {


	public static void main(String args[]){
		
		int array[] = {9,5,8,3,34,1,-5};
		
		
		int min =0;
		int minIndex =0;		
		for(int i=0; i<array.length;i++){
			min = array[i];
			for(int j=i+1;j<array.length;j++){
			    // find minimum value
				if(array[j] < min ){
					min = array[j];
					minIndex = j;
				}
			}
			//swap the numbers
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;	
		}	
		for(int k=0; k<array.length;k++){
			System.out.print(array[k]+" ");
		}	
	}
}
	
