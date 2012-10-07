package com.samples;

import java.io.IOException;

public class RunInheritanceExample {

	public static void main(String[] args) throws IOException {
		Child c = new Child();
		c.printMessage();
		c.printMessage2();
		
		Parent p = new Child();
		p.printMessage2();
		
		//Child c = new Parent(); not allowed
		
	}
}
