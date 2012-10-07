package com.examples.srini;

public class CustomException {
	public static void main(String[] args) throws MyException {
		MyException exm = new MyException();
		if(args.length == 0)
			throw exm;
	}
}
