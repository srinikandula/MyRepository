package com.samples.meenakshi;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteExample {

public static void main(String[] args) throws IOException {
	      FileInputStream in = null;
	      FileOutputStream out = null;
	      try {
	            in = new FileInputStream("orginalinput.txt");
	            out = new FileOutputStream("orginaloutput.txt");
	            
	            int m = in.read();
	            while (m != -1) {
	                out.write(m);
	                m = in.read(); 
	            }
	      }catch (FileNotFoundException e) {
	            e.printStackTrace();
	            
	        } 
	      
	        finally {
	            if (in != null) {
	                in.close();
	            }
	            if (out != null) {
	                out.close();
	            }
	        }
	    }
	}
	
	