package com.samples.ashwini;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class FileReading
  {
  public static void main( String args[]) throws IOException
  {

	  BufferedReader inputStream = null;
      PrintWriter outputStream = null;

      try {
          inputStream = new BufferedReader(new FileReader(args[0]));
          outputStream = new PrintWriter(new FileWriter(args[1]));

          String line;
          while ((line = inputStream.readLine()) != null) {
              outputStream.println(line);
          }
      } finally {
          if (inputStream != null) {
              inputStream.close();
          }
          if (outputStream != null) {
              outputStream.close();
          }
      }  }
}

