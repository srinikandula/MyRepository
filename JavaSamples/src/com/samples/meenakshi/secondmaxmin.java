package com.samples.meenakshi;
class secondmaxmin {
	public secondmaxmin(){
	
	}

	public static void main(String args[]){
			
		int array[] = {40, 4, -1, -5, 6, 30};
		int min = array[0];
		int max = array[0];
		int secondmin = array[0];
		int secondmax = array[0];
			
		for(int i=0; i<array.length;i++){
			if( array[i] < min)
				min = array[i];
				}
			System.out.println("Minimum value is "+min);
			
			
		for(int j=0; j<array.length;j++){
				if (array[j] < secondmin)
					secondmin = min;
					min = array[j];
				}
			System.out.println("Second Minimum value is "+secondmin);
			
		for(int i=0; i<array.length;i++){
					if( array[i] > max)
					max = array[i];
				}
			System.out.println("Maximum value is "+max);
	
			for(int j=0; j<array.length;j++){
				if (array[j] > secondmax)
					secondmax = max;
					secondmax = array[j];
			}
			System.out.println("Second Maximum value is "+secondmax);
	}
	
		}	