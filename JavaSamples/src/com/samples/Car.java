package com.samples;

public  abstract class Car {	//partial contract
	public abstract void getModel();  // abstract method
	
	public int getVIN(){ //concrete method
		return 123;
	}

}


