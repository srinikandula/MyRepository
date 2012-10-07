package com.samples.arun;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileInput {

	public static void main(String args[]) throws IOException{
		
		BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        
		try {
            inputStream = new BufferedReader(new FileReader("fileinput.txt"));
            outputStream = new PrintWriter(new FileWriter("fileoutput.txt"));

            String a;
            while ((a = inputStream.readLine()) != null) {
                outputStream.println(a);
                
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
	}
}
