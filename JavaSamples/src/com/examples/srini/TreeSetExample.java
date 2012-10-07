package com.examples.srini;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		Set<Student> set = new TreeSet<Student>();
		Student s = new Student();
		s.setId(101);
		Student s1 = new Student();
		s1.setId(102);
		Student s2 = new Student();
		s2.setId(103);
		
		set.add(s);
		set.add(s1);
		set.add(s2);
		
		TreeSetExample example = new TreeSetExample();
		example.test();
		
		Iterator<Student> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next().getId());
		}
	}
	public void test(){
		
		test2();
		System.out.println("this is test method");
	}
	public void test2(){
		
	}
}

/*

|			|
|			|
|			|
|			|
|			|
|			|
|	102		|
|	101		|
|-----------

*/