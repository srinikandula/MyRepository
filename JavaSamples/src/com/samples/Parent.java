package com.samples;


public class Parent {
	public Parent(){
		System.out.println("Parent class constuctor");
	}
	public void newMethod(){
		System.out.println("this is new method in parent");
	}
	public void printMessage(){
		System.out.println("this is parent class");
	}
	
	public void printMessage(int i){
		System.out.println("this is overloading");
	}
	
	public void printMessage2(){
		System.out.println("this is printMessage2 in parent class");
	}
	public final void newFinalMethod(){
		
	}
	
}


