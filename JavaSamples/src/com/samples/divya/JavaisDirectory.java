package com.samples.divya;
import java.io.*;
public class JavaisDirectory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1= new File("c://.txt");
		if(f1.isDirectory()) {
			System.out.println("Is a directory: ");
		}
		
	}

}
