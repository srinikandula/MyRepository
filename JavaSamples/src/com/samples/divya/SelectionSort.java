package com.samples.divya;

public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {12,4,99,120,1,3,10};
		
		int minimum=0;
		int minimumIndex=0;
		
				
        for(int i = 0; i < array.length; i++) {
			minimum=array[i];
			for (int j = i + 1; j < array.length; j++) {
				
				if (array[j] < minimum) {
					minimum = array[j];
					minimumIndex = j;
			}
		}
			int temp = array[i];
			array[i] = array[minimumIndex];
			array[minimumIndex] = temp;
		}
		System.out.println("values after sort: \n");
		
		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}
	}
}

		


