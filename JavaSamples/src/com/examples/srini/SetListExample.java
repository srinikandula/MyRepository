package com.examples.srini;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class SetListExample {
	public static void main(String[] args) {
		List accountList = new ArrayList();
		
		accountList = new Vector();
		int x =10;
		 x = 20;
		 
		Set uniquevalues = new HashSet();
		Object obj = new Integer(1);
		for(int i=0;i<5;i++){
			accountList.add(obj);
			uniquevalues.add(obj);
		}
		 obj = new Integer(2);
		 uniquevalues.add(obj);
		 uniquevalues.addAll(accountList);
		System.out.println("Size of the list "+accountList.size());
		System.out.println("Size of the set "+uniquevalues.size());
	}
}
