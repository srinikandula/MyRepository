package com.samples.divya;
import java.io.*;
public class CompareFiles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reading a file
		File myfile1 = new File("C://Users//Divya//Desktop//javarecords//dateprogram.txt");
		//reading another file
		File myfile2 = new File("C://Users//Divya//Desktop//javarecords//java.txt");
		if(myfile1.exists() && myfile2.exists()){
			//comparing the files
			int compareResult = myfile1.compareTo(myfile2);
			//Displaying the result
			if (compareResult < 0){
				System.out.println(myfile1.getAbsolutePath()+ "is less than" 
						+ myfile2.getAbsolutePath());
			}
			else if(compareResult== 0) {
				System.out.println(myfile1.getAbsolutePath()+ " is equal " 
						+myfile2.getAbsolutePath());
			}
			else
			{
				System.out.println(myfile1.getAbsolutePath()+ "is greater than"
						+myfile2.getAbsolutePath());
			}
			
		}
	}

}
