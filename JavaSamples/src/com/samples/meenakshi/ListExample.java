package com.samples.meenakshi;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {
	   List<String> ls=new ArrayList<String>();
	        ls.add("one");
	        ls.add("three");
	        ls.add("five");
	        ls.add("six");
	        ls.add("eight");
	        ls.add("ten");

	        Iterator it = ls.iterator();

	        while(it.hasNext())
	        {
	          String count= (String)it.next();

	          System.out.println("Count :"+count);
	        }
	    }
	}

