package com.examples.srini;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample {
	public static void main(String[] args) throws IOException {
		try{
		System.out.println("First command line argument "+args[0]);
		}catch (Exception e) {
			System.out.println("no parameter");			
			
		}
		
		File f = new File("C:\test.txt");
		FileInputStream fis = null;
		try{
			fis= new FileInputStream(f);
			//read contents of the file
			//exceptipm
			System.out.println("First argument "+args[0]);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No arguements passed");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			fis.close();
		}
	}
}
