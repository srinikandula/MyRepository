package com.samples;

import javax.print.attribute.standard.Finishings;

public class Child extends Parent {
	
	public Child(){
		super();
		System.out.println("this child class constructor");
	}
	public void printMessage(){  // method overridding
		System.out.println("this is child class");
		super.newMethod();
	}
	public void printMessage3(){  // method overridding
		System.out.println("this is printMessage3 in child class");
	}
	
}
