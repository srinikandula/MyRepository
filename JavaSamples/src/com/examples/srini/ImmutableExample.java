package com.examples.srini;

public class ImmutableExample {
	public static void main(String[] args) {
		String str = "This is cool"; //immutable
		str = "This is not cool";
		Student s = new Student();
		s.setId(1);
		s.setId(2);
		System.out.println(str);
	}

}
