package com.examples.srini;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("scannerInput.txt"));
		sc.useDelimiter(",");
	      while (sc.hasNext()) {
	          System.out.println(sc.next());
	      }
	}
}
