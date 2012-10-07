package com.examples.srini;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("testInput.txt");
            out = new FileOutputStream("testOutput.txt");

            int c = in.read();
            while (c != -1) {
                out.write(c);
                c = in.read();  
                      
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