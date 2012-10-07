package com.samples.divya;
import java.io.*;
public class FileIsHidden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// creating a file object
		File myfile = new File("c:");
// checks if the file is hidden or not.
		if(myfile.isHidden()){
			System.out.println(myfile.getAbsolutePath() +"is a hidden file");
		}
		else
		{
			System.out.println(myfile.getAbsolutePath()+ "is not a hidden file");
		}
	}

}
