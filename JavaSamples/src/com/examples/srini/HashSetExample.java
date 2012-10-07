package com.examples.srini;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		Student s = new Student();
		s.setId(101);
		Student s1 = new Student();
		s1.setId(102);
		Student s2 = new Student();
		s2.setId(103);

		
		set.add(s);
		set.add(s1);
		set.add(s2);
		
		
		Iterator<Student> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next().getId());
		}
	}
}
