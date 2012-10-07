package com.samples.meenakshi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
public class HashExample {
public static void main(String args[]){
	
	HashSet hs = new HashSet();
	hs.add(new Integer(50));
	hs.add(new Integer(100));
	hs.add(new Integer(10));
	hs.add(new Integer(5));
	System.out.println("HashSet: " + hs);

	ArrayList al = new ArrayList();
	al.add(new Integer(50));
	al.add(new Integer(100));
	al.add(new Integer(10));
	al.add(new Integer(5));
	System.out.println("ArrayList: " + al);

	TreeSet ts = new TreeSet();
	ts.add(new Integer(50));
	ts.add(new Integer(100));
	ts.add(new Integer(10));
	ts.add(new Integer(5));
	System.out.println("TreeSet: " + ts);
		}
	}

