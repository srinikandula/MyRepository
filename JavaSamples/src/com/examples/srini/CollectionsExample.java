package com.examples.srini;



import java.util.ArrayList;
import java.util.List;

import com.samples.ashwini.Account;

public class CollectionsExample {
	public static void main(String[] args) {
		String strings[] = new String[10];
		List accountList = new ArrayList(); // 10
		Integer five = new Integer(4);
		for(int i =0; i<10;i++){
			strings[i] = String.valueOf(i);
			accountList.add(String.valueOf(i));
		}
		
		System.out.println("Values from array");
		for(int i =0; i<9;i++){
			System.out.println(strings[i]);
		}
		accountList.add(five);
		//strings[20] = "newStr";
		System.out.println("Values from collection");
		for(int i =0; i<10;i++){
			System.out.println(accountList.get(i));
		}
		accountList.add(new Account());
		
		boolean exists = accountList.contains(five);
		System.out.println("Containes "+exists);
		
	}
}
