package com.examples.reflection;

public class TestOrder {
	public static void main(String[] args) {
		Order o = new Order();
		o.setCategory("watches");
		o.setId("101");
		o.toString();
		System.out.println(o);
	}
}
