package com.examples.srini;

import java.util.Hashtable;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Integer,Student> map = new Hashtable<Integer,Student>();
		Student s = new Student();
		s.setId(101);
		s.setName("abcd");
		Student s1 = new Student();
		s1.setId(102);
		s1.setName("defg");
		Student s2 = new Student();
		s2.setId(103);
		s2.setName("something");
		
		
		map.put(s.getId(), s1); //auto boxing
		map.put(s1.getId(), s1); //auto boxing
		map.put(s2.getId(), s2); //auto boxing
		
		Student stu = map.get(101);
		System.out.println("Found "+stu.getName());
	}
}
