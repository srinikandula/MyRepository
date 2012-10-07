package com.samples.meenakshi;

public class ReverseWords {
	public static  void main(String[] args) {
	    
		String s = "This place is very amazing";
	    String[] str =s.split(" ");
	    StringBuffer buffer = new StringBuffer();
	    for(int i=str.length-1; i>=0; i--)
	    {
	        buffer.append(str[i]);
	        buffer.append(" ");
	    }
	    System.out.println("\nOriginal string: " + s);
	    System.out.println("Reverse word string:"+buffer.toString());
 }

	}
