package com.samples.meenakshi;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamExample {

	public static void main(String args[]) throws Exception {
		 FileReader inputStream = null;
	     FileWriter outputStream = null;

	        try {
	            inputStream = new FileReader("orginalinput.txt");
	            outputStream = new FileWriter("characterstreamoutput.txt");

	            int m;
	            while ((m = inputStream.read()) != -1) {
	                outputStream.write(m);
	     
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